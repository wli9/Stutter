import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;
import java.io.*;
public class StutterTest4{
        @Test
        public void testIsDelimiter() {
                assertTrue(Stutter.isDelimit(','));
                assertFalse(Stutter.isDelimit('c'));
        }
        @Test
        public void testStut() {
                File fileName = new File ("C:\\Users\\Richard\\Documents\\Cs485SE\\Stutter\\Stutter-master\\src\\infile.txt");
                BufferedReader inFile;
				try {
					inFile = new BufferedReader (
					new InputStreamReader(
					                new FileInputStream(fileName)));
					Stutter.stut(inFile);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        }
        @Test
        public void testCheckDupes() {
        Stutter.checkDupes(1);
        Stutter.checkDupes(2);
        }
}