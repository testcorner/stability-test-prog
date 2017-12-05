import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Command {
	private String[] emulators;
	private boolean emulator_using[];
	public void run(String command)
	{
		try {
            Runtime rt = Runtime.getRuntime ();
            //System.out.println ("Execing " + command);
            Process proc = rt.exec (command);
            StreamConsumer errorConsumer = new
                StreamConsumer (proc.getErrorStream(), "error");           
             
            StreamConsumer outputConsumer = new
                StreamConsumer (proc.getInputStream(), "output");
                 
            errorConsumer.start ();
            outputConsumer.start ();
                                     
            int exitVal = proc.waitFor ();
            //System.out.println ("ExitValue: " + exitVal);     
 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	public String GetPid(){
//		return pid;
//	}
	public void install_apk(String apk,int emulator_n){
		String command_content="adb -s "+emulators[emulator_n]+" install "+apk;
		Command cmd = new Command();
		cmd.run(command_content);
	}
	public void uninstall_apk(String package_name,int emulator_n){
		String command_content="adb -s "+emulators[emulator_n]+" uninstall "+package_name;
		Command cmd = new Command();
		cmd.run(command_content);
	}
	public void stopApp(String mpName , int emulator_number){
		String command_content="adb -s "+emulators[emulator_number]+" shell am force-stop "+mpName;
		Command cmd = new Command();
		cmd.run(command_content);
	}
	
	public void stopAllApp(String mpName){
		for(int i=0;i<emulators.length;i++){
			String command_content="adb -s "+emulators[i]+" shell am force-stop "+mpName;
			Command cmd = new Command();
			cmd.run(command_content);
		}
	}
	public void openTargetApp(String mpName,String mpMainActivity,int emulator_number){
		String command_content="adb -s "+emulators[emulator_number]+" shell am start "+mpName+"/"+mpName+"."+mpMainActivity;
		Command cmd = new Command();
		cmd.run(command_content);
	}
	public void allOpenTargetApp(String mpName,String mpMainActivity){
		for(int i=0;i<emulators.length;i++){
			String command_content="adb -s "+emulators[i]+" shell am start "+mpName+"/"+mpName+"."+mpMainActivity;
			Command cmd = new Command();
			cmd.run(command_content);
		}
	}
	
	public void setEmulator(int emulatorCount){
		emulators=new String[emulatorCount];
		for(int i=0;i<emulators.length;i++){
			int temp=101+i;
			emulators[i]="192.168.56."+Integer.toString(temp)+":5555";
		}
		emulator_using=new boolean[emulatorCount];
		for(int i=0;i<emulator_using.length;i++){
			emulator_using[i]=false;
		}
	}
	public String getEmulator(int emulator_number){
		return emulators[emulator_number];
	}
	public void mkdir(String name){
		Command cmd = new Command();
		cmd.run("mkdir "+name);
	}

	public void rrun() {
		// TODO Auto-generated method stub
		String command_content="adb devices";
		Command cmd = new Command();
		cmd.run(command_content);
	}
	
	public void cdwindows(String input,String strr){
		
		String command = input + "\\";
		//String command = "C:\\Users\\EdenLai\\Test\\espresso\\BasicSample";
		String path =strr;
		// String[] command3 = {"cmd.exe", "/C", command};
		 String[] command4 = {"cmd.exe", "/c", "gradlew connectedAndroidTest"};	 
		 ProcessBuilder pb = new ProcessBuilder(command4);
		 pb.directory(new File(command + path));
		 Process p;
		try {
			p = pb.start();
			int exitValue = p.waitFor();
	        if (exitValue == 0)
	        	{System.out.println("\n\nExit from " + path); 
	        	System.out.println("Task Over");
	        	}
	        else{
	        System.out.println("\n\nExit Value is " + exitValue);     
	        System.out.println("\n\nExit from " + path);  
	        }
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		    catch (InterruptedException e) 
		    {            
		        e.printStackTrace();        
		    }

}
	
public void cdpathforlinux(String input,String strr){
		
		String command = input +"/";
		//String command = "C:\\Users\\EdenLai\\Test\\espresso\\BasicSample";
		String path =strr;
		// String[] command3 = {"cmd.exe", "/C", command};
		
		 String[] command4 = {"/bin/bash", "-c", "./gradlew connectedAndroidTest"};	 
		 ProcessBuilder pb = new ProcessBuilder(command4);
		 pb.directory(new File(command + path));
		 Process p;
		try {
			p = pb.start();
			 int exitValue = p.waitFor();
		        if (exitValue == 0)
		        	{System.out.println("\n\nExit from " + path); 
		        	System.out.println("Task Over");
		        	}
		        else{
		        System.out.println("\n\nExit Value is " + exitValue);     
		        System.out.println("\n\nExit from " + path);  
		        }
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		    catch (InterruptedException e) 
		    {            
		        e.printStackTrace();        
		    }
	

	}
}


class StreamConsumer extends Thread {
    InputStream is;
    String type;
     
    StreamConsumer (InputStream is, String type) {
        this.is = is;
        this.type = type;
    }
     
    public void run () {
        InputStreamReader isr = new InputStreamReader (is);
		BufferedReader br = new BufferedReader (isr);
		String line = null;
		//while ((line = br.readLine()) != null)
		   // System.out.println (type + ">" + line);   
    }
}