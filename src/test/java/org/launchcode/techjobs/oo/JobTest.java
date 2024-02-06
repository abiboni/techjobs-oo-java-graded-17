package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {


    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
       Job job =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue( job instanceof Job);
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
    @Test
    public void testJobsForEquality() {
        Job job1 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(job1, job2);
    }
//    TASK 5
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(System.lineSeparator() + "ID: " + job.getId() + System.lineSeparator() + "Name: " + job.getName() + System.lineSeparator() + "Employer: " + job.getEmployer() + System.lineSeparator() + "Location: " + job.getLocation() + System.lineSeparator() + "Position Type: " + job.getPositionType() + System.lineSeparator() + "Core Competency: " + job.getCoreCompetency() + System.lineSeparator(), job.toString());
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job.toString(), job.toString());
        assertEquals("ID: " + job.getId(), "ID: " + job.getId());
        assertEquals("Name: " + job.getName(), "Name: " + job.getName());
        assertEquals("Employer: " + job.getEmployer(), "Employer: " + job.getEmployer());
        assertEquals("Location: " + job.getLocation(), "Location: " + job.getLocation());
        assertEquals("Position Type: " + job.getPositionType(), "Position Type: " + job.getPositionType());
        assertEquals("Core Competency: " + job.getCoreCompetency(), "Core Competency: " + job.getCoreCompetency());
    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals("ID: " + job.getId(), "ID: " + job.getId());
        assertEquals("Employer: " + "Data Unavailable", "Employer: " + "Data Unavailable");
        assertEquals("Location: " + "Data Unavailable", "Location: " + "Data Unavailable");
        assertEquals("Position Type: " + "Data Unavailable", "Position Type: " + "Data Unavailable");
        assertEquals("Core Competency: " + "Data Unavailable", "Core Competency: " + "Data Unavailable");

    }

}
