import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.html.ImageView;

import javafx.scene.control.ProgressBar;
import sun.misc.IOUtils;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.*;
import javax.swing.filechooser.FileFilter;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.io.File;

public class DualListBoxCase extends JPanel {
	
  private static final Insets EMPTY_INSETS = new Insets(0, 0, 0, 0);
  private static final String ADD_BUTTON_LABEL = ">>>>>";
  private static final String REMOVE_BUTTON_LABEL = "<<<<<";
  private static final String REMOVE_ALL_BUTTON_LABEL = "Remove All";
  private static final String DEFAULT_SOURCE_CHOICE_LABEL = "Available Tests";
  private static final String DEFAULT_DEST_CHOICE_LABEL = "Choices Tests";
  private static final String upString = "up";
  private static final String downString = "down";
  private JLabel sourceLabel;
  private static JList sourceList;
  private SortedListModel sourceListModel;
  private static JList destList;
  private SortedListModel destListModel;
  //private SortedListModel destListModel;
  private JLabel destLabel;
  private JButton addButton;
  private JButton removeButton;
  private JButton btnNewButton;
  private static JButton Do;
  private Formatter x;
  static Command ci = new Command();
  static String input;
  static String SDKinput;
  //File file = new File("/home/eden/Desktop/Test/ls2.txt");
  //String path = "d:\\Users\\EdenLai\\Desktop\\Test\\espresso\\BasicSample";
  private JTextArea log;
  private JFileChooser fc;
  private JButton show;
  Timer timer;
  public DualListBoxCase() {
    initScreen();
  }
  
///get dir 0424
  
  public String getSourceChoicesTitle() {
    return sourceLabel.getText();
  }

  public void setSourceChoicesTitle(String newValue) {
    sourceLabel.setText(newValue);
  }

  public String getDestinationChoicesTitle() {
    return destLabel.getText();
  }

  public void setDestinationChoicesTitle(String newValue) {
    destLabel.setText(newValue);
  }

  public void clearSourceListModel() {
    sourceListModel.clear();
  }

  public void clearDestinationListModel() {
    destListModel.clear();
  }

  public void addSourceElements(ListModel newValue) {
    fillListModel(sourceListModel, newValue);
  }

  public void setSourceElements(ListModel newValue) {
    clearSourceListModel();
    addSourceElements(newValue);
  }

  public void addDestinationElements(ListModel newValue) {
    fillListModel(destListModel, newValue);
  }

  private void fillListModel(SortedListModel model, ListModel newValues) {
    int size = newValues.getSize();
    for (int i = 0; i < size; i++) {
      model.add(newValues.getElementAt(i));
    }
  }

  public void addSourceElements(Object newValue[]) {
    fillListModel(sourceListModel, newValue);
  }

  public void setSourceElements(Object newValue[]) {
    clearSourceListModel();
    addSourceElements(newValue);
  }

  public void addDestinationElements(Object newValue[]) {
    fillListModel(destListModel, newValue);
  }

  private void fillListModel(SortedListModel model, Object newValues[]) {
    model.addAll(newValues);
  }

  public Iterator sourceIterator() {
    return sourceListModel.iterator();
  }

  public Iterator destinationIterator() {
    return destListModel.iterator();
  }

  public void setSourceCellRenderer(ListCellRenderer newValue) {
    sourceList.setCellRenderer(newValue);
  }

  public ListCellRenderer getSourceCellRenderer() {
    return sourceList.getCellRenderer();
  }

  public void setDestinationCellRenderer(ListCellRenderer newValue) {
    destList.setCellRenderer(newValue);
  }

  public ListCellRenderer getDestinationCellRenderer() {
    return destList.getCellRenderer();
  }

  public void setVisibleRowCount(int newValue) {
    sourceList.setVisibleRowCount(newValue);
    destList.setVisibleRowCount(newValue);
  }

  public int getVisibleRowCount() {
    return sourceList.getVisibleRowCount();
  }

  public void setSelectionBackground(Color newValue) {
    sourceList.setSelectionBackground(newValue);
    destList.setSelectionBackground(newValue);
  }

  public Color getSelectionBackground() {
    return sourceList.getSelectionBackground();
  }

  public void setSelectionForeground(Color newValue) {
    sourceList.setSelectionForeground(newValue);
    destList.setSelectionForeground(newValue);
  }

  public Color getSelectionForeground() {
    return sourceList.getSelectionForeground();
  }

  private void clearSourceSelected() {
    Object selected[] = sourceList.getSelectedValues();
    for (int i = selected.length - 1; i >= 0; --i) {
      sourceListModel.removeElement(selected[i]);
    }
    sourceList.getSelectionModel().clearSelection();
  }

  private void clearDestinationSelected() {
    Object selected[] = destList.getSelectedValues();
    for (int i = selected.length - 1; i >= 0; --i) {
      destListModel.removeElement(selected[i]);
    }
    destList.getSelectionModel().clearSelection();
  }
  
  private void initScreen() {
    setBorder(BorderFactory.createEtchedBorder());
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.rowHeights = new int[]{14, 30, 0, 50, 120, 120, 0, 20, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    gridBagLayout.columnWidths = new int[]{0, 102, 0, 0, 31};
    gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
    gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
    setLayout(gridBagLayout);
    sourceLabel = new JLabel("Available Test Cases");
    sourceLabel.setFont(new Font("Arial", Font.BOLD, 20));
    sourceLabel.setHorizontalAlignment(SwingConstants.CENTER);
    sourceListModel = new SortedListModel();
    sourceList = new JList(sourceListModel);
    sourceList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    sourceList.setFont(new Font("Arial", Font.PLAIN, 21));
    add(sourceLabel, new GridBagConstraints(0, 0, 1, 2, 0, 0,
        GridBagConstraints.CENTER, GridBagConstraints.NONE,
        new Insets(0, 0, 5, 5), 0, 0));
    JScrollPane scrollPane = new JScrollPane(sourceList);
    add(scrollPane, new GridBagConstraints(0, 2, 1, 16, .5,
        1, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
        new Insets(0, 0, 5, 5), 0, 0));

    destLabel = new JLabel("Selected Test Cases");
    destLabel.setFont(new Font("Arial", Font.BOLD, 20));
    destLabel.setHorizontalAlignment(SwingConstants.CENTER);
   destListModel = new SortedListModel();
    destList = new JList(destListModel);
    destList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    destList.setFont(new Font("Arial", Font.PLAIN, 21));
    add(destLabel, new GridBagConstraints(3, 0, 1, 2, 0, 0,
        GridBagConstraints.CENTER, GridBagConstraints.NONE,
        new Insets(0, 0, 5, 5), 0, 0));
    add(new JScrollPane(destList), new GridBagConstraints(2, 2, 2, 16, .5,
        1, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
        new Insets(0, 0, 5, 5), 0, 0));
        
        btnNewButton_3 = new JButton(new ImageIcon(DualListBoxCase.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//random class seed 每一次都是都是一樣的
        		
        		String seed = JOptionPane.showInputDialog("<html><h2>please type seed ( if no input seed ,it will randomly sorting test case ) </h2></html>");
        		
         		   if(seed.isEmpty())
         		{
         			  for(int i=0;i<dim2.size();i++){
           		        int swapWith = (int)(Math.random()*(dim2.size()-i))+i;
           		        if(swapWith==i) continue;
           		        dim2.add(i, dim2.remove(swapWith));
           		        //dim2.add(swapWith, dim2.remove(i+1));
           		        
        		 }
        		 }
         		   else
        		 {
        			
         		       int seednum = Integer.valueOf(seed);

               		Random r = new Random();
               		r.setSeed(seednum);
               		
               		 for(int i=0;i<dim2.size();i++){
               		        //int swapWith = (int)(Math.random()*(dim2.size()-i))+i;
               			    int swapWith = 0;
               			    int x = (int)r.nextLong();
               			    if (x<0)
               			    	x*=-1;
               			    swapWith = x %dim2.size();	
               		        System.out.println(swapWith);
               		        if(swapWith==i) continue;
               		       dim2.add(i, dim2.remove(swapWith));
               		   //    dim2.add(swapWith, dim2.remove(i+1));
        		 }
        		 
        		 }
        	}
        });
        GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
        gbc_btnNewButton_3.fill = GridBagConstraints.VERTICAL;
        gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
        gbc_btnNewButton_3.gridx = 4;
        gbc_btnNewButton_3.gridy = 3;
        add(btnNewButton_3, gbc_btnNewButton_3);
        
        btnNewButton_1 = new JButton("\u2191");
        btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 33));
        btnNewButton_1.addActionListener(new UpDownListener() {
        });
        
            addButton = new JButton("------->");
            addButton.setFont(new Font("Courier New", Font.BOLD, 18));
            GridBagConstraints gbc_addButton = new GridBagConstraints();
            gbc_addButton.fill = GridBagConstraints.HORIZONTAL;
            gbc_addButton.insets = new Insets(0, 0, 5, 5);
            gbc_addButton.gridx = 1;
            gbc_addButton.gridy = 4;
            add(addButton, gbc_addButton
            		//, new GridBagConstraints(1, 6, 1, 1, 0, .25,
               // GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
               // new Insets(0, 0, 5, 5), 0, 0
            		//)
            );
            addButton.addActionListener(new AddListener());
        GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
        gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
        gbc_btnNewButton_1.gridx = 4;
        gbc_btnNewButton_1.gridy = 4;
        add(btnNewButton_1, gbc_btnNewButton_1);
        
        btnNewButton_2 = new JButton("\u2193");
        btnNewButton_2.addActionListener(new UpDownListener() {
        });
        removeButton = new JButton("<------");
        removeButton.setFont(new Font("Courier New", Font.BOLD, 18));
        GridBagConstraints gbc_removeButton = new GridBagConstraints();
        gbc_removeButton.fill = GridBagConstraints.HORIZONTAL;
        gbc_removeButton.insets = new Insets(0, 0, 5, 5);
        gbc_removeButton.gridx = 1;
        gbc_removeButton.gridy = 5;
        add(removeButton, gbc_removeButton
        		//, new GridBagConstraints(1, 7, 1, 1, 0, .25,
            //GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 5, 5), 0, 0)
        		);
        removeButton.addActionListener(new RemoveListener());
        btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 33));
        GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
        gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
        gbc_btnNewButton_2.gridx = 4;
        gbc_btnNewButton_2.gridy = 5;
        add(btnNewButton_2, gbc_btnNewButton_2);
    
    show = new JButton("Show Devices");
    show.setFont(new Font("Arial", Font.PLAIN, 18));
    show.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		ci.rrun();
    		JOptionPane.showMessageDialog(show, "No devices");
    	}
    });
    
    btnNewButton = new JButton(REMOVE_ALL_BUTTON_LABEL);
    btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		sourceList.setModel(dim3);
            int start = 0;
    	    int end = destList.getModel().getSize();
    	    destList.setSelectionInterval(start, end);
    	    for(int i = start ; i < end; i ++)
    	    {
    	    dim3.addElement(destList.getSelectedValue());
            dim2.removeElement(destList.getSelectedValue());
    	    }
    	}
    });
    
    btnAddAll = new JButton("Add All");
    btnAddAll.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		destList.setModel(dim2);
            int start = 0;
    	    int end = sourceList.getModel().getSize();
    	    sourceList.setSelectionInterval(start, end);
    	    for(int i = start ; i < end; i ++)
    	    {
    	    dim2.addElement(sourceList.getSelectedValue());
            dim3.removeElement(sourceList.getSelectedValue());
    	    }
    	}
    });
    
    btnAddAll.setFont(new Font("Arial", Font.PLAIN, 18));
    GridBagConstraints gbc_btnAddAll = new GridBagConstraints();
    gbc_btnAddAll.fill = GridBagConstraints.HORIZONTAL;
    gbc_btnAddAll.insets = new Insets(0, 0, 5, 5);
    gbc_btnAddAll.gridx = 1;
    gbc_btnAddAll.gridy = 9;
    add(btnAddAll, gbc_btnAddAll);
    GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
    gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
    gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
    gbc_btnNewButton.gridx = 1;
    gbc_btnNewButton.gridy = 10;
    add(btnNewButton, gbc_btnNewButton);
    
    Do = new JButton("Execute");
    Do.setFont(new Font("Arial", Font.PLAIN, 18));
    // Do.addActionListener(new ExcuteListener() {
	//	});
    
     
     GridBagConstraints gbc_Do = new GridBagConstraints();
     gbc_Do.fill = GridBagConstraints.HORIZONTAL;
     gbc_Do.insets = new Insets(0, 0, 5, 5);
     gbc_Do.gridx = 1;
     gbc_Do.gridy = 11;
     add(Do, gbc_Do);
    GridBagConstraints gbc_show = new GridBagConstraints();
    gbc_show.fill = GridBagConstraints.HORIZONTAL;
    gbc_show.insets = new Insets(0, 0, 5, 5);
    gbc_show.gridx = 1;
    gbc_show.gridy = 12;
    add(show, gbc_show);
    
    lblNewLabel_1 = new JLabel(" ");
    GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
    gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
    gbc_lblNewLabel_1.gridx = 1;
    gbc_lblNewLabel_1.gridy = 16;
    add(lblNewLabel_1, gbc_lblNewLabel_1);
    
    lblNow = new JLabel(" ");
    GridBagConstraints gbc_lblNow = new GridBagConstraints();
    gbc_lblNow.fill = GridBagConstraints.HORIZONTAL;
    gbc_lblNow.insets = new Insets(0, 0, 5, 5);
    gbc_lblNow.gridx = 1;
    gbc_lblNow.gridy = 17;
    add(lblNow, gbc_lblNow);
    
    lblNewLabel = new JLabel("Directory : Not set yet");
    lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
    lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
    GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
    gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
    gbc_lblNewLabel.gridwidth = 5;
    gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
    gbc_lblNewLabel.gridx = 0;
    gbc_lblNewLabel.gridy = 18;
    add(lblNewLabel, gbc_lblNewLabel);
    
    lblCurrentOsNot = new JLabel("OS :  Not select yet");
    lblCurrentOsNot.setFont(new Font("Arial", Font.PLAIN, 15));
    lblCurrentOsNot.setHorizontalAlignment(SwingConstants.LEFT);
    GridBagConstraints gbc_lblCurrentOsNot = new GridBagConstraints();
    gbc_lblCurrentOsNot.anchor = GridBagConstraints.WEST;
    gbc_lblCurrentOsNot.insets = new Insets(0, 0, 5, 5);
    gbc_lblCurrentOsNot.gridx = 0;
    gbc_lblCurrentOsNot.gridy = 19;
    add(lblCurrentOsNot, gbc_lblCurrentOsNot);
    
    lblCurrentSdkNot = new JLabel("SDK Location : Not set yet");
    lblCurrentSdkNot.setFont(new Font("Arial", Font.PLAIN, 15));
    lblCurrentSdkNot.setHorizontalAlignment(SwingConstants.LEFT);
    GridBagConstraints gbc_lblCurrentSdkNot = new GridBagConstraints();
    gbc_lblCurrentSdkNot.gridwidth = 2;
    gbc_lblCurrentSdkNot.anchor = GridBagConstraints.WEST;
    gbc_lblCurrentSdkNot.insets = new Insets(0, 0, 5, 5);
    gbc_lblCurrentSdkNot.gridx = 2;
    gbc_lblCurrentSdkNot.gridy = 19;
    add(lblCurrentSdkNot, gbc_lblCurrentSdkNot);
    
    progressBar = new JProgressBar();
    progressBar.setValue(0);
    progressBar.setStringPainted(true);
    GridBagConstraints gbc_progressBar = new GridBagConstraints();
    gbc_progressBar.gridwidth = 5;
    gbc_progressBar.fill = GridBagConstraints.HORIZONTAL;
    gbc_progressBar.gridx = 0;
    gbc_progressBar.gridy = 20;
    add(progressBar, gbc_progressBar);
  }

  public static void main(String args[]) {

    JFrame f = new JFrame("GT Manager");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    DualListBoxCase dual = new DualListBoxCase();
    //dual.addSourceElements(new String[] {"BasicSample", "BasicSampleBundled", "CustomMatcherSample", "DataAdapterSample", "IdlingResourceSample", "IntentsAdvancedSample", "IntentsBasicSample", "MultiWindowSample", "RecyclerViewSample", "WebBasicSample" });
    f.getContentPane().add(dual, BorderLayout.CENTER);
    
    JOptionPane.showMessageDialog(dual,"<html><h2>Please execute setup wizard , <font color='red'> Tap >> Menu >> Setup Wizard </font></html>");
    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("<html><h3>Menu");
    JMenu menu2 = new JMenu("<html><h3>Log");
    JMenu menu3 = new JMenu("<html><h3>Setting");
    JMenu menu4 = new JMenu("<html><h3>Properties");
    menuBar.add(menu);
    menuBar.add(menu2);
    menuBar.add(menu3);
    menuBar.add(menu4);
    JMenuItem item = new JMenuItem("<html><h3>Setup Wizard");
    item.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {

    		int mType=JOptionPane.INFORMATION_MESSAGE;
    		String[] os={"Microsoft Windows", "Linux"};
    	    String in2=(String)JOptionPane.showInputDialog(f,"<html><h3>Select current os　　　　　　　　　　　　　　　　　　　</h3></html>","Os", mType,null,os,"Os");
    	    System.out.println(in2);
    	 //   JOptionPane.showMessageDialog(f,"Set os : " + in2);
    	    if(in2 == "Microsoft Windows")
    	    {
    	    	lblCurrentOsNot.setText("OS : "+in2);
    	    	Do.addActionListener(new Excutewindows());
    	    	//label.setText("Already Test");
    	    	
    	    	
    	    	
    	    }
    	    if(in2 == "Linux")
    	        {
    	    		lblCurrentOsNot.setText("OS : "+in2);
    	        	Do.addActionListener(new Excutelinux());
    	        	//label.setText("Already Test");
    	        }
    		
    		
    		String choosertitle = "Choose file directory";
    		JFileChooser chooser = new JFileChooser();
    		chooser = new JFileChooser(); 
    	    chooser.setCurrentDirectory(new java.io.File("."));
    	    chooser.setDialogTitle(choosertitle);
    	    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    	    //
    	    // disable the "All files" option.
    	    //
    	    chooser.setAcceptAllFileFilterUsed(false);
    	    //    
    	    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) { 
    	      System.out.println(chooser.getSelectedFile());
    	      
    	    String tt = chooser.getSelectedFile().toString();
  		    tt = Pattern.compile("[\\\\]").matcher(tt).replaceAll("/"); // 
  		    input = tt;
  		    
  		  lblNewLabel.setText("Directory : " + tt);
  		    
    	      }
    	    else {
    	      System.out.println("No Selection ");
    	      }
    		SDKinput = JOptionPane.showInputDialog("<html><h3>Type SDK Location　　　　　　　　　　　　　　　　　　　</h3></html>");
      		 while(SDKinput.equals(""))
      		 {
      			 JOptionPane.showMessageDialog(f,"Please input SDK Location");
      			 SDKinput=JOptionPane.showInputDialog("Set SDK");
      		 } 
      		    //JOptionPane.showMessageDialog(f,"SDK Location : " + SDKinput);
      		    
      		    String t = SDKinput;
      		    t = Pattern.compile("[\\\\]").matcher(t).replaceAll("/"); // 嚙諸書在嚙踝蕭
      		    lblCurrentSdkNot.setText("SDK Location : "+ t);
      		    System.out.println(t);
    
    	 try{
		        FileWriter fw = new FileWriter(input+ "/local.properties", false);
		        BufferedWriter bw = new BufferedWriter(fw); //撠ufferedWeiter��ileWrite�隞嗅���蝯�
		        String sss1 = "sdk.dir="+t;
		        		String sss2	=t+"=";
		        bw.write(sss1);
		        bw.newLine();
		        bw.write(sss2);
		        bw.close();
		    }catch(IOException e1){
		       e1.printStackTrace();
		    }
 	
    	}
    });
    JMenuItem item2 = new JMenuItem("<html><h3>Save");
    item2.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		   try {
                   
    			   JFileChooser fileChooser = new JFileChooser();
    	    		fileChooser.addChoosableFileFilter(new txtFilter());
    	    		String ext="";
    	            String extension=fileChooser.getFileFilter().getDescription();
    	    		if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
    	    		  File file = fileChooser.getSelectedFile();
    	    		  
                   FileWriter filer = new FileWriter(file);
                   PrintWriter out = new PrintWriter(filer);
                   for (int i = 0; i < destList.getModel().getSize(); i++) {
                        
                       Object item = destList.getModel().getElementAt(i);
                        
                       out.println(item);
                     
                   }
    out.close();
    	    		}
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

    	}
    });
    
    JMenuItem item3 = new JMenuItem("<html><h3>Load");
    //item3.addActionListener(new Filechooser());
   item3.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		dim2.clear();
    		dim3.clear();
    		JFileChooser fileChooser = new JFileChooser();//嚙褐告filechooser 
    		fileChooser.addChoosableFileFilter(new txtFilter());
    		int returnValue = fileChooser.showOpenDialog(null);//嚙編嚙碼filechooser 
    		if (returnValue == JFileChooser.APPROVE_OPTION) //嚙瞑嚙稻嚙瞌嚙稻嚙踝蕭嚙踝蕭仵嚙� 
    		{ 
    			
        		String ext="";
                String extension=fileChooser.getFileFilter().getDescription();
    		File selectedFile = fileChooser.getSelectedFile();//嚙踝蕭嚙踝蕭嚙踝蕭File 
    		
    		int i;
			try {
			        Scanner sc = new Scanner(selectedFile);
			        while(sc.hasNextLine()){
			        	
			    	        	dim3.addElement(sc.nextLine());
			    	        	sourceList.setModel(dim3);
		            }
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
          
			
    	       
    	}
   }
    });
   
    JMenuItem item4 = new JMenuItem("<html><h3>Exit");
    item4.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		System.exit(0);
    	}
    });
    JMenuItem item5 = new JMenuItem("<html><h3>ScreenShot");
    JMenuItem item6 = new JMenuItem("<html><h3>Report");
    JMenuItem item7 = new JMenuItem("<html><h3>Manual type Directory");
    item7.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		 input=JOptionPane.showInputDialog("Type Directory");
    		 while(input.equals(""))
    		 {
    			 JOptionPane.showMessageDialog(f,"Please input");
    			 input=JOptionPane.showInputDialog("Set Directory");
    		 } 
    		    JOptionPane.showMessageDialog(f,"File Directory : " + input);
    		    
    		    String t = input;
    		    t = Pattern.compile("[\\\\]").matcher(t).replaceAll("/"); // 嚙諸書在嚙踝蕭
    		    lblNewLabel.setText("Current Directory : " + t);
    		    System.out.println(t);
    	}
    });
    JMenuItem item8 = new JMenuItem("<html><h3>Set OS");
    item8.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		int mType=JOptionPane.INFORMATION_MESSAGE;
    		String[] os={"Microsoft Windows", "Linux"};
    	    String in2=(String)JOptionPane.showInputDialog(f,"Select os","Os", mType,null,os,"Os");
    	    System.out.println(in2);
    	    //JOptionPane.showMessageDialog(f,"Set os : " + in2);
    	    if(in2 == "Microsoft Windows")
    	    {
    	    	lblCurrentOsNot.setText("OS : "+in2);
    	    	Do.addActionListener(new Excutewindows());
    	    	
    	    	
    	    	
    	    }
    	    else if(in2 == "Linux")
    	        {
    	    		lblCurrentOsNot.setText("OS : "+in2);
    	        	Do.addActionListener(new Excutelinux());
    	        }

    	}
    });
    JMenuItem item9 = new JMenuItem("<html><h3>About");
    item9.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		JOptionPane.showMessageDialog(item9, "Hello world");
    	}
    });
    
    JMenuItem item11 = new JMenuItem("<html><h3>Set SDK Location");
    item11.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		 SDKinput = JOptionPane.showInputDialog("Type SDK Location");
    		 while(SDKinput.equals(""))
    		 {
    			 JOptionPane.showMessageDialog(f,"Please input SDK Location");
    			 SDKinput=JOptionPane.showInputDialog("Set SDK");
    		 } 
    		    JOptionPane.showMessageDialog(f,"SDK Location : " + SDKinput);
    		    
    		    String t = SDKinput;
    		    t = Pattern.compile("[\\\\]").matcher(t).replaceAll("/"); // 嚙諸書在嚙踝蕭
    		    lblCurrentSdkNot.setText("SDK Loaction : "+ t);
    		    System.out.println(t);
    	
    		    try{
    		        FileWriter fw = new FileWriter(input+ "/local.properties", false);
    		        BufferedWriter bw = new BufferedWriter(fw); //撠ufferedWeiter��ileWrite�隞嗅���蝯�
    		        String sss1 = "sdk.dir="+t;
    		        		String sss2	=t+"=";
    		        bw.write(sss1);
    		        bw.newLine();
    		        bw.write(sss2);
    		        bw.close();
    		    }catch(IOException e1){
    		       e1.printStackTrace();
    		    }
    	}	
    	
    });
    
    
    
    JMenuItem item10 = new JMenuItem("<html><h3>Setup");
    menu.add(item);
    menu.add(item2);
    menu.add(item3);
    menu.add(item4);
    menu2.add(item5);
    menu2.add(item6);
    menu3.add(item7);
    menu3.add(item8);
    menu3.add(item10);
    menu3.add(item9);
    menu4.add(item11);
    f.setJMenuBar(menuBar);
    //f.pack();
    f.setSize(1024, 768);
    f.setVisible(true);
  }
	static DefaultListModel dim2 = new DefaultListModel();
	static DefaultListModel dim3 = new DefaultListModel();
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private static JLabel lblNewLabel;
	private static JLabel lblCurrentOsNot;
	private static JLabel lblCurrentSdkNot;
	private static JLabel lblNewLabel_1;
	private static JLabel lblNow;
	private static JProgressBar progressBar;
	private JButton btnAddAll;
	
	
  private class AddListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    	sourceList.clearSelection();
    	sourceList.setModel(dim3);
    	destList.setModel(dim2);
    	
        int start = sourceList.getAnchorSelectionIndex();
	    int end = sourceList.getLeadSelectionIndex()+1;
	    sourceList.addSelectionInterval(start, end);
        
	    for(int i = start ; i < end; i ++)
	    {
	    dim2.addElement(sourceList.getSelectedValue());
        dim3.removeElement(sourceList.getSelectedValue());
        sourceList.setSelectedIndex(start);
	    }
	  
    }
  }

  private class RemoveListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    	destList.clearSelection();
    	destList.setModel(dim2);
    	sourceList.setModel(dim3);
    	
        int start = destList.getAnchorSelectionIndex();
	    int end = destList.getLeadSelectionIndex()+1;
	    destList.addSelectionInterval(start, end);
        
	    for(int i = start ; i < end; i ++)
	    {
	    dim3.addElement(destList.getSelectedValue());
        dim2.removeElement(destList.getSelectedValue());
        destList.setSelectedIndex(start);
	    }
	  
    }
  }

private static class Excutewindows implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    	if(input.equals(""))
			System.out.println("s");
		else{
			
			JOptionPane.showMessageDialog(Do, "Program begin test");
			
			 
			
				ListModel s = destList.getModel();
				int ssize = s.getSize();
			    progressBar.setMinimum(0);
				progressBar.setMaximum(ssize);
				
				for (int i=0; i<ssize;i++)
				{
					Object ss = s.getElementAt(i);
				//System.out.println(s);
				String strr= ss.toString();
				//timer.start();
				progressBar.setValue(i);
				progressBar.update(progressBar.getGraphics());
				System.out.println(i);
				try {
					//JOptionPane.showMessageDialog(Do, "Program begin test");
					cdwindows(input,strr);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			//ci.runes();
	}
				progressBar.setValue(ssize);
				progressBar.update(progressBar.getGraphics());
   }
  }
 }
  
private static class Excutelinux implements ActionListener {
	    public void actionPerformed(ActionEvent e2) {
	    	if(input.equals(""))
				System.out.println("s");
			else{
				ListModel s = destList.getModel();
				int ssize = s.getSize();
				progressBar.setMinimum(0);
				progressBar.setMaximum(ssize);
				
				for (int i=0; i<ssize;i++)
				{
					Object ss = s.getElementAt(i);
				//System.out.println(s);
				String strr= ss.toString();
				//timer.start();
				progressBar.setValue(i);
				progressBar.update(progressBar.getGraphics());
				System.out.println(i);
				try {
						cdpathforlinux(input,strr);
					} catch (Exception e21) {
						// TODO Auto-generated catch block
						e21.printStackTrace();
					}
		}	
				progressBar.setValue(ssize);
				progressBar.update(progressBar.getGraphics());
	   }
	  }
	 }
  
class UpDownListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        int moveMe = destList.getSelectedIndex();

        if (e.getActionCommand().equals("\u2191")) {
            //UP ARROW BUTTON
            if (moveMe != 0) {
                //not already at top
                swap(moveMe, moveMe - 1);
                destList.setSelectedIndex(moveMe - 1);
                destList.ensureIndexIsVisible(moveMe - 1);
            }
        } else {
            //DOWN ARROW BUTTON
            if (moveMe != dim2.getSize() - 1) {
                //not already at bottom
                swap(moveMe, moveMe + 1);
                destList.setSelectedIndex(moveMe + 1);
                destList.ensureIndexIsVisible(moveMe + 1);
            }
        }
    }
}

private void swap(int a, int b) {
    Object aObject = dim2.getElementAt(a);
    Object bObject = dim2.getElementAt(b);
    dim2.set(a, bObject);
    dim2.set(b, aObject);
}

public static void cdwindows(String input2, String strr) {
	// TODO Auto-generated method stub
	String command = input + "\\";
	String path =strr;
	 String[] command4 = {"cmd.exe", "/c", "gradlew connectedAndroidTest"};	 
	 ProcessBuilder pb = new ProcessBuilder(command4);
	 pb.directory(new File(command + path));
	 
	 Thread t= new Thread()  {
         public void run()  {
              SwingUtilities.invokeLater(new Runnable() {
                     public void run() {
                    		lblNewLabel_1.setText(path);
                    		lblNow.setText("Task Over");
                    		lblNewLabel_1.update(lblNewLabel_1.getGraphics());
                        	lblNow.update(lblNow.getGraphics());
                    }
                });
         }
    };
    t.start();
	 
	 
	 
	 Process p;
	try {
		
		p = pb.start();
		int exitValue = p.waitFor();
		
	    
		
        if (exitValue == 0)
        	{
        	lblNow.setText("Task Over");
        	lblNow.update(lblNow.getGraphics());
        	System.out.println("\n\nExit from " + path);
        	
        	System.out.println("Task Over");
        	}
        else{
        System.out.println("\n\nExit Value is " + exitValue);     
        System.out.println("\n\nExit from " + path);  
        
        //lblNewLabel_1.setText(path);
		lblNewLabel_1.update(lblNewLabel_1.getGraphics());
    	//lblNow.setText("Task Failed");
    	lblNow.update(lblNow.getGraphics());
    	
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

public static void cdpathforlinux(String input2, String strr) {
	// TODO Auto-generated method stub
	String command = input +"/";
	String path =strr;
	 String[] command4 = {"/bin/bash", "-c", "./gradlew connectedAndroidTest"};	 
	 ProcessBuilder pb = new ProcessBuilder(command4);
	 pb.directory(new File(command + path));
	 Process p;
	try {
		p = pb.start();
	
		 int exitValue = p.waitFor();
	       // if (exitValue == 0)
	        	//{
	        	System.out.println("\n\nExit from " + path);
	        	lblNewLabel_1.setText(path);
	        	lblNow.setText("Task Over");
	        	System.out.println("Task Over");
	        //	}
	        //else{
	     //   System.out.println("\n\nExit Value is " + exitValue);     
	      //  System.out.println("\n\nExit from " + path);  
	       // }
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



class txtFilter extends FileFilter
{ 
   public boolean accept(File f)
  {
       if (f.isDirectory())
         {
           return false;
         }

        String s = f.getName();

      //return s.endsWith(".txt")||s.endsWith(".TXT");
        return s.endsWith(".gpt");
  }

  public String getDescription() 
 {
      //return "*.txt,*.TXT";
	  return ".gpt";
 }

}


class SortedListModel extends AbstractListModel {

  SortedSet model;

  public SortedListModel() {
    model = new TreeSet();
  }
public void setModel(SortedListModel sourceListModel) {
	// TODO Auto-generated method stub
	
}

public int getSize() {
    return model.size();
  }

  public Object getElementAt(int index) {
    return model.toArray()[index];
  }

  public void add(Object element) {
    if (model.add(element)) {
      fireContentsChanged(this, 0, getSize());
    }
  }
  public void addAll(Object elements[]) {
    Collection c = Arrays.asList(elements);
    model.addAll(c);
    fireContentsChanged(this, 0, getSize());
  }
  public void clear() {
    model.clear();
    fireContentsChanged(this, 0, getSize());
  }
  public boolean contains(Object element) {
    return model.contains(element);
  }
  public Object firstElement() {
    return model.first();
  }
  public Iterator iterator() {
    return model.iterator();
  }
  public Object lastElement() {
    return model.last();
  }
  public boolean removeElement(Object element) {
    boolean removed = model.remove(element);
    if (removed) {
      fireContentsChanged(this, 0, getSize());
    }
    return removed;
  }

  
}
