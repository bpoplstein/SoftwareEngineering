package tracing.views;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.part.ViewPart;

public class RequirementsIndicesView extends ViewPart implements ISelectionProvider{
	
	private void showMessage(){
<<<<<<< HEAD
		MessageDialog.openInformation(new Shell(),
				"This is a thing",
				"Lets get this stuff done");
=======
		//Create UI Frame and components
		JFrame UI = new JFrame();
		JPanel dialog = new JPanel(new GridLayout(5, 3, 20, 10));
		JTextField srcFolder = new JTextField();
		JTextField rmvFile = new JTextField();
		JTextField rstFile = new JTextField();
		JButton btnSRC = new JButton("Browse");
		JButton btnRestore = new JButton("Browse");
		JButton btnRemove = new JButton("Browse");
		JButton btnOk = new JButton("Ok");
		JFileChooser fileDialog = new JFileChooser();
		JLabel lblReq = new JLabel("Requirements Source Folder: ");
		JLabel placeHolder = new JLabel(" ");
		
		
		//Create checkboxes
		JCheckBox chbxToken = new JCheckBox("Tokenizing");
		JCheckBox chbxRestore = new JCheckBox("Restoring Acronyms");
		JCheckBox chbxRemove = new JCheckBox("Removing Stop Words");
		JCheckBox chbxStem = new JCheckBox("Stemming");
		
		//Buttons
		btnSRC.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e)
					{
						fileDialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
						int returnVal = fileDialog.showOpenDialog(UI);
						if(returnVal == JFileChooser.APPROVE_OPTION)
						{
							java.io.File file = fileDialog.getSelectedFile();
							srcFolder.setText(file.getPath());
						}
					}
				});
		btnRestore.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				fileDialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int returnVal = fileDialog.showOpenDialog(UI);
				if(returnVal == JFileChooser.APPROVE_OPTION)
				{
					java.io.File file = fileDialog.getSelectedFile();
					srcFolder.setText(file.getPath());
				}
			}
		});
		btnRemove.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				fileDialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int returnVal = fileDialog.showOpenDialog(UI);
				if(returnVal == JFileChooser.APPROVE_OPTION)
				{
					java.io.File file = fileDialog.getSelectedFile();
					srcFolder.setText(file.getPath());
				}
			}
		});
		
		btnOk.addActionListener(new ActionListener()
		{
			//TODO 
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		
		//Make sure it closes on exit
		UI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Start Making Input area
		UI.setSize(600, 350);
		UI.setLocationRelativeTo(null);
		
		//Add the Components
		dialog.add(lblReq);
		dialog.add(srcFolder);
		dialog.add(btnSRC);

		
		dialog.add(chbxStem);
		dialog.add(placeHolder);
		
		dialog.add(chbxRemove);
		dialog.add(btnRemove);
		dialog.add(rmvFile);
		
		dialog.add(chbxRestore);
		dialog.add(btnRestore);
		dialog.add(rstFile);
		
		dialog.add(chbxToken);
		
		dialog.add(btnOk);
		

		
		
		UI.add(dialog);
		
		UI.setVisible(true);
>>>>>>> FETCH_HEAD
	}
	
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ISelection getSelection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSelection(ISelection selection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createPartControl(Composite parent) {
		
		showMessage();
		
		//Set layout forum of parent composite
		parent.setLayout(new FormLayout());
		
		FormData formdata = new FormData();
		formdata.top=new FormAttachment(0,5);
		formdata.left = new FormAttachment(0,10);
		formdata.right = new FormAttachment(0,200);
		
		//Create title label
		Label titleLabel = new Label(parent,SWT.SINGLE);
		titleLabel.setText("Requirements Indices:");
		titleLabel.setLayoutData(formdata);
		
		//Create text area
		Text indicesText = new Text(parent,SWT.MULTI|SWT.V_SCROLL|SWT.READ_ONLY);
		indicesText.setText("This is a sample result.");
		formdata = new FormData();
		formdata.top = new FormAttachment(titleLabel,10);
		formdata.bottom = new FormAttachment(titleLabel,230);
		formdata.left = new FormAttachment(0,10);
		formdata.right = new FormAttachment(0,800);
		indicesText.setLayoutData(formdata);
		
		
		Button manageButton = new Button(parent,SWT.PUSH);
		manageButton.setText("Manage...");
		formdata = new FormData();
		formdata.top = new FormAttachment(indicesText,10);
		formdata.left = new FormAttachment(0,730);
		manageButton.setLayoutData(formdata);
		
		manageButton.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				showMessage();
				
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

}
