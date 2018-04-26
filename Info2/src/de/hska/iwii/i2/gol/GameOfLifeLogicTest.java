package de.hska.iwii.i2.gol;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameOfLifeLogicTest {
	private boolean[][] blinker;
	private GameOfLifeLogic logik;
	
	@BeforeEach
	void attributeInitialisieren() {
		blinker = new boolean[][] {
				{false, false, false, false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false, false, false, false},
				{false, false, false, true,  true,  true,  false, false, false, false},
				{false, false, false, false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false, false, false, false}
		};
		
		logik = new GameOfLifeLogic();	
		logik.setStartGeneration(blinker);
	}
	
	@Test
	void testSetStartGeneration() {
		boolean[][] block = new boolean[][]{
			{false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, true,  true,  false, false, false, false},
			{false, false, false, false, true,  true,  false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false}
		};
		logik.setStartGeneration(block);
		
		assertTrue(!logik.isCellAlive(0, 3));
		assertTrue(logik.isCellAlive(4, 4));
		assertTrue(logik.isCellAlive(4, 5));
		assertTrue(!logik.isCellAlive(4, 6));
		assertTrue(logik.isCellAlive(5, 4));
		assertTrue(logik.isCellAlive(5, 5));
		assertTrue(!logik.isCellAlive(4, 3));
		
	}

	@Test
	void testNextGeneration() {
		logik.nextGeneration();
		
		assertTrue(logik.isCellAlive(3, 4));
		assertTrue(!logik.isCellAlive(4, 3));
		assertTrue(logik.isCellAlive(4, 4));
		assertTrue(!logik.isCellAlive(4, 5));
		assertTrue(logik.isCellAlive(5, 4));
	}

	@Test
	void testIsCellAlive() {
		assertTrue(!logik.isCellAlive(0, 0));
		assertTrue(logik.isCellAlive(4, 4));
	}

}
