package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    // Test the Empty Constructor
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    // Test the Full Constructor
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getName());

        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals("ACME", job.getEmployer().getValue());

        assertTrue(job.getLocation() instanceof Location);
        assertEquals("Desert", job.getLocation().getValue());

        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job.getPositionType().getValue());

        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    // Test the equals Method
    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

    // Test toString method starts and ends with a new line
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testToString = job.toString();

        assertTrue(testToString.startsWith(System.lineSeparator()));
        assertTrue(testToString.endsWith(System.lineSeparator()));
    }

    // Test toString method contains correct labels and data for each field
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testToString = job.toString();

        assertTrue(testToString.contains("ID: " + job.getId()));
        assertTrue(testToString.contains("Name: Product tester"));
        assertTrue(testToString.contains("Employer: ACME"));
        assertTrue(testToString.contains("Location: Desert"));
        assertTrue(testToString.contains("Position Type: Quality control"));
        assertTrue(testToString.contains("Core Competency: Persistence"));
    }

    // Test toString method handles empty fields with “Data not available”
    @Test
    public void testToStringHandlesEmptyField() {
//        Job job = new Job();
//        String testToString = job.toString();
//
//        assertTrue(testToString.contains("Name: Data not available"));
//        assertTrue(testToString.contains("Employer: Data not available"));
//        assertTrue(testToString.contains("Location: Data not available"));
//        assertTrue(testToString.contains("Position Type: Data not available"));
//        assertTrue(testToString.contains("Core Competency: Data not available"));

    }

}
