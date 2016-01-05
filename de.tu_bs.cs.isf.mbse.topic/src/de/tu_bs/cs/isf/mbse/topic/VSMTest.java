package de.tu_bs.cs.isf.mbse.topic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.LinkedList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class VSMTest {
	
	private static VectorSpaceModel vsm;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		vsm = new VectorSpaceModel();
	}

	@Test
	public void testVectorSpaceModel() {
		assertNotNull(vsm);
	}

	@Test
	public void testBuildDocumentVectors() {
		
		assertEquals(3, vsm.getDocumentMatrix().rows());
	}

}
