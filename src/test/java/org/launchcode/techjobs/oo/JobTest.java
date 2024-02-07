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
        String newLine = System.lineSeparator();

        assertTrue(job.toString().startsWith(newLine));
        assertTrue(job.toString().endsWith(newLine));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newLine = System.lineSeparator();
        assertEquals(job.toString(), job.toString());
        assertEquals(newLine + "ID: " + job.getId() + newLine +
                "Name: Product tester" + newLine +
                "Employer: ACME" + newLine +
                "Location: Desert" + newLine +
                "Position Type: Quality control" + newLine +
                "Core Competency: Persistence" + newLine,
                job.toString());
    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String newLine = System.lineSeparator();
        assertEquals(newLine + "ID: " + job.getId() + newLine +
                        "Name: Data not available" + newLine +
                        "Employer: Data not available" + newLine +
                        "Location: Data not available" + newLine +
                        "Position Type: Data not available" + newLine +
                        "Core Competency: Data not available" + newLine,
                job.toString());

    }

}
