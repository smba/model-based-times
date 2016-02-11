import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;


public class ImageDownloader {

  public static void main(String[] args) throws IOException {
		 ImageDownloader.downloadFile("testYjalaFile.jpg", "http://yjala.de/wp-content/uploads/2015/09/band.jpg");		 
	}
  
  public static void downloadFile(String fileName, String url) throws IOException {
	  //String fileName = "yjaladownloaded.jpg"; //The file that will be saved on your computer
		 URL link = new URL(url); //The file that you want to download
		
  //Code to download
		 InputStream in = new BufferedInputStream(link.openStream());
		 ByteArrayOutputStream out = new ByteArrayOutputStream();
		 byte[] buf = new byte[1024];
		 int n = 0;
		 while (-1!=(n=in.read(buf)))
		 {
		    out.write(buf, 0, n);
		 }
		 out.close();
		 in.close();
		 byte[] response = out.toByteArray();

		 FileOutputStream fos = new FileOutputStream(fileName);
		 fos.write(response);
		 fos.close();
  //End download code
		 
		 System.out.println("Finished");

  }

}