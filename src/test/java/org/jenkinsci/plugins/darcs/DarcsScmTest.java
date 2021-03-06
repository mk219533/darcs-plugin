/*
 * LICENSE
 *
 * "THE BEER-WARE LICENSE" (Revision 42):
 * "Sven Strittmatter" <ich@weltraumschaf.de> wrote this file.
 * As long as you retain this notice you can do whatever you want with
 * this stuff. If we meet some day, and you think this stuff is worth it,
 * you can buy me a beer in return.
 */

package org.jenkinsci.plugins.darcs;

import hudson.model.TaskListener;

//import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Ignore;

/**
 *
 * @author Sven Strittmatter <ich@weltraumschaf.de>
 */
public class DarcsScmTest extends TestCase {
	
    public DarcsScmTest(String testName) {
        super(testName);
    }

    @Ignore("Incomplete!")
    public void testGetRevisionState() {
		DarcsScm sut = new DarcsScm("");
		try {
			sut.getRevisionState(null, TaskListener.NULL, "");
		} catch (Exception e) {
			fail("Excpetion throwed: " + e);
		}
    }
}
