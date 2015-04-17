package ProcessIntroClass;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import Library.CTest;

public class GetInputStateAndOutputState {
	private String folder;
	private String fileName;
	private int[] buggyLines;
	public GetInputStateAndOutputState(String folder, String fileName,
			int[] buggyLines) {
		super();
		this.folder = folder;
		this.fileName = fileName;
		this.buggyLines = buggyLines;
		compileGDB();
	}
	private void compileGDB() {
		String command = "gcc -g " + this.folder + "/" + this.fileName + " -o " + this.folder + "/a.out";
		CTest.runCProgram(command);
		GDBpipeWriter writer = new GDBpipeWriter(this.folder + "/a.out", 12, "3 2 1\n");
		writer.start();
		
	}
	
	public static void main(String[] args){
		GetInputStateAndOutputState instan = new GetInputStateAndOutputState("./bughunt/median/0", "median.c", new int[]{12, 17});
	}

}


class GDBpipeWriter extends Thread{
	private String path;
	private int BuggyLine;
	private String input;
	
    public GDBpipeWriter(String path, int buggyLine, String input) {
		super();
		this.path = path;
		this.BuggyLine = buggyLine;
		this.input = input;
	}

	public void run(){
	    Process p = null;
	    try {
	    p = Runtime.getRuntime().exec("gdb " + this.path);
	   //new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
	   //new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
	    PrintWriter stdin = new PrintWriter(p.getOutputStream());
	    
	    stdin.flush();
	    stdin.println("set logging on");
	    stdin.flush();
	    stdin.println("break " + this.BuggyLine);
	    stdin.println("command 1\ninfo locals\n info variables\nwhatis a\nend");
	    stdin.flush();
	    stdin.println("run");
	    stdin.println(this.input);
	    //stdin.println("whatis a");
	    //stdin.println("continue");
	    stdin.flush();
	   // stdin.flush();
	    stdin.println(this.input);
	   
//	    stdin.println("c");
	    stdin.flush();
//	    stdin.flush();
	    //stdin.close();

    /// write any other commands you want here
   // stdin.close();


    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}


class SyncPipe implements Runnable
{
	public SyncPipe(InputStream istrm, OutputStream ostrm) {
	      istrm_ = istrm;
	      ostrm_ = ostrm;
	  }
	  public void run() {
	      try
	      {
	          final byte[] buffer = new byte[1024];
	          for (int length = 0; (length = istrm_.read(buffer)) != -1; )
	          {
	              ostrm_.write(buffer, 0, length);
	          }
	
	      }
	      catch (Exception e)
	      {
	          e.printStackTrace();
	      }
	  }
	  private final OutputStream ostrm_;
	  private final InputStream istrm_;
}