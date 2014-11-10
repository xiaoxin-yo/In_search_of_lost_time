package edu.usc;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JWindow;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileFilter;

public class Interface {
	private String paper = "Using therapeutic antibodies that need to cross the blood-brain barrier (BBB) to treat neurological disease is a difficult challenge. We have shown that bispecific antibodies with optimized binding to the transferrin receptor (TfR) that target β-secretase (BACE1) can cross the BBB and reduce brain amyloid-β (Aβ) in mice. Can TfR enhance antibody uptake in the primate brain? We describe two humanized TfR/BACE1 bispecific antibody variants. Using a human TfR knock-in mouse, we observed that anti-TfR/BACE1 antibodies could cross the BBB and reduce brain Aβ in a TfR affinity–dependent fashion. Intravenous dosing of monkeys with anti-TfR/BACE1 antibodies also reduced Aβ both in cerebral spinal fluid and in brain tissue, and the degree of reduction correlated with the brain concentration of anti-TfR/BACE1 antibody. These results demonstrate that the TfR bispecific antibody platform can robustly and safely deliver therapeutic antibody across the BBB in the primate brain.\n\nThe blood-brain barrier (BBB) remains a formidable obstacle for developing therapeutics to treat neurological disease, particularly for large molecules such as antibodies (1–3). Previous efforts exploiting the transferrin (Tf)/transferrin receptor (TfR) pathway to enhance large-molecule uptake in the brain via receptor-mediated transcytosis have focused exclusively on rodent TfR binding antibodies (4, 5). Thus, it remains to be shown if the TfR pathway can be used to cross the BBB in primates. TfR pathway validation for brain delivery in primates is critical if this approach is to be used in a clinical setting for central nervous system disease targets with access restricted by the BBB. Here, we describe the generation and characterization of primate-specific TfR bispecific antibodies designed to boost antibody uptake into the primate brain.\n\nPreviously, anti-TfRA, an antibody that binds selectively to mouse TfR, was engineered to investigate the TfR pathway for brain uptake and safety liabilities in mice (6, 7). We showed that by reducing affinity for TfR in either the bivalent or the monovalent (bispecific) format, brain uptake and biodistribution were improved. Here, we have now generated a new antibody to primate TfR, which cross-reacts with both human and monkey TfR expressed on human embryonic kidney (HEK) 293 cells (Fig. 1A). This antibody was then humanized to generate anti-TfR1. Anti-TfR1 does not block ligand binding to TfR, as shown by assessing the binding of anti-TfR1 to TfR in the presence or absence of Tf (Fig. 1B) and human hemochromatosis (HFE) protein (Fig. 1C). Consistent with its nonblocking properties, the anti-TfR1 binding site was mapped to the apical domain, a site distant from these ligand binding sites (Fig. 1D). To assess TfR affinity relationships for brain uptake, we generated a second lower-affinity variant called anti-TfR2 by introducing a single alanine substitution into CDR-L3 (complementarity determining region L3) of the anti-TfR1 light chain (Fig. 1E). Monovalent TfR binding of anti-TfR2 showed a 20- to 25-fold decrease in affinity to both human and monkey TfR (Fig. 1E). Furthermore, there was an about fourfold decrease in monovalent binding affinity observed from human to monkey TfR for both anti-TfR variants, which is particularly relevant because previous studies have shown that modest changes in affinity can affect brain uptake (6, 8).\n\nUsing “knob into holes” technology, a method that promotes heterodimerization of two different half-antibodies into a bispecific immunoglobulin G (IgG) antibody (9), primate cross-reactive anti-TfR variants were combined with an antibody directed against a target in the brain, β-secretase (BACE1), thus generating anti-TfR/BACE1 bispecific antibodies (Fig. 1E). BACE1 is an aspartyl protease responsible for the first of two cleavage events in amyloid precursor protein (APP) that give rise to amyloid-β (Aβ) peptides, which accumulate as plaques in the brains of patients with Alzheimer’s disease (10). Although BACE1 is a therapeutic target for Alzheimer’s disease, inhibition of BACE1 also provides an ideal pharmacodynamic (PD) signal for assessing the activity of antibodies that cross the BBB. To assess brain activity of the TfR bispecific antibody after systemic delivery in primates, we used a previously described anti-BACE1 antibody that binds to mouse, monkey, and human BACE1 (11). As expected, both anti-TfR1/BACE1 and anti-TfR2/BACE1 were equally potent at reducing Aβ production in mouse neurons (Fig. 1F).";
	//	private String paper = "Localized protein synthesis plays a critical role in creating subcellular structures by allowing protein production at the site of action and in response to local cellular need. Local translation is involved in diverse processes, including developmental patterning, cellular motility, synaptic plasticity, and protein trafficking through the secretory pathway. Despite this broad importance, few gene expression tools are available that faithfully preserve spatial information. We developed a flexible deep sequencing–based methodology (termed proximity-specific ribosome profiling) that enables precise characterization of localized protein synthesis. We applied our method to analyze translation at the endoplasmic reticulum (ER) in yeast and mammalian cells.\n\nWe identified several principles used by cells to coordinate translation with ER targeting. Cotranslational targeting to the ER is pervasive and is principally determined by the location of the hydrophobic targeting sequence within the protein, rather than the mechanism of targeting or translocation. The position of this hydrophobic domain within the open reading frame determines the duration of time a targeted ribosome nascent-chain complex (RNC) can associate with the ER. Our data suggest a role for polysomes in retaining mRNAs at the ER, allowing for efficient targeting of RNCs for translocation.";
	//	private String paper = "Sulfate (SO42-) is the second-most abundant anion after chloride in the modern ocean. It serves as an easily accessible energy source for sulfate-reducing prokaryotes (SRPs), which are commonly found in organic-rich sediments and play an important role in the decomposition of organic matter. Were these microbes major players in ecosystems during the Archean (before 2.5 billion years ago), when molecular oxygen was virtually absent from both the atmosphere and oceans? Whether this was the case depends on how much sulfate there was in the Archean ocean. Three articles in this issue (1-3) use precise measurements of stable sulfur isotope ratios to investigate how much sulfate there was in the Archean ocean and where that sulfate originated. Scientists use the ratio between two stable sulfur isotopes, 34S and 32S, to trace SRP activity in ancient sedimentary rocks. In sediments, the microbes preferentially reduce 32SO42- compared to 34SO42-, producing iron sulfide minerals that are depleted in 34S (a process called mass-dependent isotopic fractionation). 34S depletion recorded in pyrite (FeS2) minerals is thus a good indicator of SRP activity. Large 34S depletions are seen in the geological records starting about 2.3 billion years ago, but not before (4). One possible interpretation of these data is that there was little SRP activity in the Archean. Another possibility is that these microbes appeared much earlier, but that the Archean sulfate levels were too low for them to selectively reduce 32SO42-; low sulfate levels are known to reduce the degree of isotopic fractionation (5).";
	//	private String paper = "Renal dendritic cells (DCs) and macrophages represent a constitutive, extensive and contiguous network of innate immune cells that provide sentinel and immune-intelligence activity; they induce and regulate inflammatory responses to freely filtered antigenic material and protect the kidney from infection. Tissue-resident or infiltrating DCs and macrophages are key factors in the initiation and propagation of renal disease, as well as essential contributors to subsequent tissue regeneration, regardless of the aetiological and pathogenetic mechanisms. The identification, and functional and phenotypic distinction of these cell types is complex and incompletely understood, and the same is true of their interplay and relationships with effector and regulatory cells of the adaptive immune system. In this Review, we discuss the common and distinct characteristics of DCs and macrophages, as well as key advances that have identified the renal-specific functions of these important phagocytic, antigen-presenting cells, and their roles in potentiating or mitigating intrinsic kidney disease. We also identify remaining issues that are of priority for further investigation, and highlight the prospects for translational and therapeutic application of the knowledge acquired.";
	private JTextArea textArea;
	private MessageWindow window;
	private final int windowWidth = 800;
	private final int windowHeight = 1000;
	private TextManipulation tmp;
	private ArrayList<JLabel> sentenceLabels;
	private JPanel sentencePanel;
	private Font font = new Font("Segoe UI", Font.PLAIN, 20);
	private JLabel definitionArea;
	private String fileName;

	public static void main(String [] args) {
		try {
			// Set System L&F - L&F stands for look and feel
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} 
		catch (UnsupportedLookAndFeelException e) {
			// handle exception
		}
		catch (ClassNotFoundException e) {
			// handle exception
		}
		catch (InstantiationException e) {
			// handle exception
		}
		catch (IllegalAccessException e) {
			// handle exception
		}
		Interface myInterface = new Interface();
		JFrame frame = new JFrame("Abberay");
		myInterface.setFrame(frame);
		myInterface.setTextArea(frame);
		myInterface.showWindow(frame);
		myInterface.createMenuBar(frame, myInterface);
		frame.setVisible(true);
	}

	private void setFrame(JFrame frame) {
		// initial setup
		frame.setLocation(20, 20);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.pack();
		frame.setSize(windowWidth,windowHeight);
	}

	private void setTextArea(JFrame frame) {
		// text area
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new BorderLayout());
		textArea = new JTextArea(paper);
		//		textArea.setSize(windowWidth-50, windowHeight);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);

		textArea.setFont(font);
		// textArea -> JScrollPane -> textPanel
		textPanel.add(new JScrollPane(textArea));
		// textPanel -> frame
		frame.add(textPanel);
		textArea.addMouseListener(new MyMouseListener(frame));
	}

	//	private void setJMenuBar(JFrame frame) {
	//		JMenuBar jmb = new JMenuBar();
	//		JMenu fileMenu = new JMenu("File");
	//		JMenuItem fileItem = new JMenuItem("Open .txt file");
	//		fileMenu.add(fileItem);
	//		jmb.add(fileMenu);
	//		frame.setJMenuBar(jmb);
	//		
	//		// fileItem event
	//		fileItem.addActionListener(new ActionListener() {
	//			@Override
	//			public void actionPerformed(ActionEvent e) {
	//				
	//			}
	//		});
	//	}

	protected void createMenuBar(JFrame frame, Interface myInterface) {
		// TODO Auto-generated method stub
		// open file menu bar
		JMenuBar jmb = new JMenuBar();
		JMenu imageMenu = new JMenu("File");
		JMenuItem openMenuItem = new JMenuItem("Open txt file");
		imageMenu.add(openMenuItem);
		jmb.add(imageMenu);
		frame.setJMenuBar(jmb);
		final JFileChooser fileDialog= new JFileChooser();
		ImageFilter myFilter = new ImageFilter();
		fileDialog.setFileFilter(myFilter);
		openMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				window.setVisible(false);
				int returnVal = fileDialog.showOpenDialog(null);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					fileName = fileDialog.getSelectedFile().getAbsolutePath();
					FileReader fr = null;
					try {
						fr = new FileReader(fileName);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (fr != null) {
						BufferedReader br = new BufferedReader(fr);
						String line;
						try {
							line = br.readLine();
							paper = "";
							while (line != null){
								paper += line + "\n";
								line = br.readLine();
							}
							br.close();
							fr.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

				textArea.setText(paper);
				myInterface.showWindow(frame);
			}
		});
	}

	public class ImageFilter extends FileFilter {

		//Accept all directories and all txt files.
		public boolean accept(File f) {
			if (f.isDirectory()) {
				return true;
			}
			String extension = "";
			int i = f.getName().lastIndexOf('.');
			if (i > 0) {
				extension = f.getName().substring(i+1);
			}
			if (extension != null) {
				if (extension.equals("txt")) {
					return true;
				} else {
					return false;
				}
			}

			return false;
		}

		//The description of this filter
		public String getDescription() {
			return "text";
		}
	}


	private void showWindow(JFrame frame) {
		tmp = new TextManipulation(paper);
		this.window = new MessageWindow(frame);
		this.window.setLayout(new BorderLayout());

		// to edit when intelligent definition is implemented

		definitionArea = new JLabel("Intelligent definition");
		definitionArea.setFont(font);
		//		definitionArea.setEditable(false);
		//
		sentenceLabels = new ArrayList<JLabel>();

		for (int i=0;i<3;i++) {
			sentenceLabels.add(new JLabel());
			sentenceLabels.get(i).setFont(font);
		}
		this.window.add(definitionArea,BorderLayout.NORTH);
		sentencePanel = new JPanel();
		sentencePanel.setLayout(new BoxLayout(sentencePanel, BoxLayout.Y_AXIS));
		for (int i=0;i<3;i++) {
			sentencePanel.add(sentenceLabels.get(i));
		}
		this.window.add(sentencePanel,BorderLayout.CENTER);
		this.window.pack();
	}

	class MyMouseListener extends MouseAdapter{
		JFrame frame;
		//		JWindow window;
		public MyMouseListener(JFrame frame) {
			this.frame = frame;
			//			this.window = window;
		}
		public void mouseClicked(MouseEvent e){
			if(e.getClickCount() == 2){
				int upperCaseCount = 0;
				for(int y = 0; y < textArea.getSelectedText().length() ; y++){
					if(Character.isUpperCase(textArea.getSelectedText().charAt(y))){
						upperCaseCount ++;
					}
				}
				// pop up window only if more than 2 letters in the abbv are upper case
				if (upperCaseCount>=2) {
					window.setLocation(e.getLocationOnScreen().x+10, e.getLocationOnScreen().y+10);
					tmp.setAbbv(textArea.getSelectedText());
					tmp.prepare(tmp);
					int minDisplay = 3;
					if (tmp.results.size()<3) {
						minDisplay = tmp.results.size();
					}
					for (int i=0;i<tmp.results.size();i++) {
						System.out.println(tmp.results.get(i));
					}
					int nSentenceLabels = sentenceLabels.size(); 
					if (minDisplay < nSentenceLabels) {
						for (int i=nSentenceLabels-1;i>=minDisplay;i--) {
							sentencePanel.remove(sentenceLabels.get(i));
							sentenceLabels.remove(i);
							sentencePanel.revalidate();
							sentencePanel.repaint();
						}
					}
					if (minDisplay > nSentenceLabels) {
						for (int i=nSentenceLabels;i<minDisplay;i++) {
							sentenceLabels.add(new JLabel());
							sentenceLabels.get(i).setFont(font);
							sentencePanel.add(sentenceLabels.get(i));
						}
					}
					String html1 = null, html2 = null;
					for (int i=0;i<minDisplay;i++) {
						String s = (i+1) + ". " + tmp.results.get(i);
						html1 = "<html><body style='width: ";
						html2 = "px'>\n";
						//					System.out.println(s);
						String result = html1+"200"+html2+s;
						result = result.replaceAll(textArea.getSelectedText(), "<b>"+textArea.getSelectedText()+"</b>");
						sentenceLabels.get(i).setText(result);
					}

					// intelligent definition set text
					String def = tmp.findBestLongForm(textArea.getSelectedText(), tmp.findLongForm());
					if (def == null && textArea.getSelectedText().substring(textArea.getSelectedText().length()-1, textArea.getSelectedText().length()).equals("s"));
					def = tmp.findBestLongForm(textArea.getSelectedText().substring(0, textArea.getSelectedText().length()-1), tmp.findLongForm(textArea.getSelectedText().substring(0, textArea.getSelectedText().length()-1)));
					if (def != null) {
						definitionArea.setText(html1+"200"+html2+"<b>"+def+"</b>");
					}
					else {
						definitionArea.setText(html1+"200"+html2+def);
					}

					window.pack();
					window.setVisible(true);
				}
			}
			else if (e.getClickCount() == 1) {
				window.setVisible(false);
			}
		}
		//		
		//		private String splitAndBold(String sentence, String abbv) {
		//			ArrayList<Integer> indexes = new ArrayList<Integer>();
		//			int startIndex = 0;
		//			while(sentence.substring(startIndex, sentence.length()).indexOf(abbv)!=-1) {
		//				startIndex = sentence.substring(startIndex, sentence.length()).indexOf(abbv);
		//				indexes.add(startIndex);
		//			}
		//					
		//		}
	}

	class MessageWindow extends JWindow{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public MessageWindow(JFrame parent) { 
			super(parent);
			//			setSize(200, 300);
		}

		public void paint(Graphics g) 
		{ 
			super.paint(g);
			g.drawRect(0,0,getSize().width - 1,getSize().height - 1); 
		}
	}
}


