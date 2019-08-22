package shenmingming_utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.shenmingming.common.utils.DateUtils;
import com.shenmingming.common.utils.FileUtils;
import com.shenmingming.common.utils.StreamUtils;

public class Filetest {

  @Test
  public void test() {
    FileUtils.getExtendName("sdasqw.jpg");
  }

  @Test
  public void testdate() {
    Date sc = new Date();
    SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date dateByInitMonth = DateUtils.getDateByInitMonth(sc);
    String format = sp.format(dateByInitMonth);
    System.out.println(format);
  }

  @Test
  public void testlastdate() {
    Date sc = new Date();
    SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date dateByInitMonth = DateUtils.getDateByFullMonth(sc);
    String format = sp.format(dateByInitMonth);
    System.out.println(format);
  }

  @Test
  public void testCloseAll() throws FileNotFoundException, IOException {
    StreamUtils.closeAll(new FileInputStream(new File("e:\\a.txt")));
  }

  @Test
  public void testReadTextFile() throws FileNotFoundException, IOException {
    System.out.println(StreamUtils.readTextFile(new FileInputStream(new File("e:\\a.txt"))));

  }
}
