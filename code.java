
//importing javax and java packages

import java.awt.event.* ;

import java.awt.* ;

import javax.swing.* ;

import java.io.* ;

import javax.swing.event.* ;


// public class decleration "code"


public class code {
    
    //declearion of JFrame main frame of the GUI.
    
    JFrame frame = new JFrame ( "Employee Response Form" ) ;
    
    
    //string data for Date Of Birth.
    
    
    String dates[]
            = { "--", "1", "2", "3", "4", "5",
                "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15",
                "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25",
                "26", "27", "28", "29", "30",
                "31" } ;
    
        String months[]
            = { "--", "Jan", "feb", "Mar", "Apr",
                "May", "Jun", "July", "Aug",
                "Sup", "Oct", "Nov", "Dec" } ;
    
        String years[]
            = { "--", "1991", "1992", "1993", "1994",
                "1995", "1996", "1997", "1998",
                "1999", "2000", "2001", "2002",
                "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010",
                "2011", "2012", "2013", "2014",
                "2015", "2016", "2017", "2018",
                "2019", "2020" } ;
    
    
    //String Data for qualification and Department.
    
    
    String qualification[]
        = { "SSC", "Intermediate", "Bachelor's Degree",
            "master's degree" } ;
    
    String Department[]
        = { "Aerospace Engineering", "BioEngineering",
            "BioInformatics","Chemical Engineering",
            "Civil Engineering", "Computer Science &Engineering",
            "Electrical & Electronics Engineering",
            "Electronics & Communication Engineering",
            "Information & Communication Technology",
            "Information Technology", "Mechanical Engineering" } ;

    
    //Decleration of JLabels for various Index labels.
    
    
    JLabel EmpNameLabel = new JLabel ( "Employee Name" ) ;
    
    JLabel EmpNumberLabel = new JLabel ( "Employee Number" ) ;
    
    JLabel EmpGenderLabel = new JLabel ( "Gender" ) ;
    
    JLabel EmpQualificationLabel = new JLabel ( "Higher Qualification" ) ;
    
    JLabel EmpDepartmentLabel = new JLabel ( "Department" ) ;
    
    JLabel EmpDOBLabel = new JLabel ( "Date of Birth" ) ;
    
    JLabel EmpEmailLabel = new JLabel ( "Email ID" ) ;
    
    JLabel EmpAddressLabel = new JLabel ( "Address" ) ;
    
    JLabel EmpHobbyLabel = new JLabel ( "Hobby" ) ;
    
    JLabel EmployExtraCALabel = new JLabel ( "Extra-Curricular activities" ) ;
    
    
    //Decleration of JLabels for various Validator Labels.
    
    
    JLabel EmpNameValidLabel = new JLabel ( "* Name must not Empty" ) ;
    
    JLabel EmpNumberValidLabel = new JLabel ( "* Contains 9 Characters" ) ;
    
    JLabel EmpGenderValidLabel = new JLabel ( "* Gender must not Empty" ) ;
    
    JLabel EmpDOBValidLabel = new JLabel ( "* DOB must not Empty" ) ;
    
    JLabel EmpEmailValidLabel = new JLabel ( "* Invalid Email" ) ;
    
    JLabel EmpAddressValidLabel = new JLabel ( "* Address must Not Empty" ) ;
    
    JLabel EmpQualificationValidLabel = new JLabel ( "* Qualification must not Empty" ) ;
    
    JLabel EmpDepartmentValidLabel = new JLabel ( "* Department must not Empty" ) ;
    
    
    //Decleration of booleans for various which Activates SUBMIT button.
    
    
    boolean EmpNameValidBool =  false ;

    boolean EmpNumberValidBool = false ;

    boolean EmpGenderValidBool = false ;

    boolean EmpDOBValidBool = false ;

    boolean EmpEmailValidBool = false ;

    boolean EmpAddressValidBool = false ;

    boolean EmpQualificationValidBool = false ;

    boolean EmpDepartmentValidBool = false ;
    
    boolean EmpTermsvalidBool = true ;
    
    
    //Decleration of JTextField for various.
    
    
    JTextField EmpNameTextField = new JTextField ( ) ;
    
    JTextField EmpNumberTextField = new JTextField ( ) ;
    
    JTextField EmpEmailIdTextField = new JTextField ( ) ;
    
    JTextField EmpHobbyTextField = new JTextField ( "Optional" ) ;
    
    JTextField EmployExtraCATextField = new JTextField ( "Optional" ) ;
    
    
    //Deceleration of JTextArea for employee Address.
    
    
    JTextArea EmpAddressTextArea = new JTextArea ( ) ;
    
    
    //Declearion of JRadioButton for Employee Gender.
    
    
    JRadioButton EmpGenderMaleRadioButton = new JRadioButton( "Male" ) ;
    
    JRadioButton EmpGenderFemaleRadioButton = new JRadioButton ( "Female" ) ;
    
    JRadioButton EmpGenderOthersRadioButton = new JRadioButton ( "Others" ) ;
    
    ButtonGroup EmpGenderButtonGroup = new ButtonGroup ( ) ;
    
    
    //Declearion of JComboBox for Employee DateOfBirth.
    
    
    JComboBox EmpDOBDateComboBox = new JComboBox ( dates ) ;
    
    JComboBox EmpDOBMonthComboBox = new JComboBox ( months ) ;
    
    JComboBox EmpDOBYearComboBox = new JComboBox ( years ) ;
    
    
    //Decleration of JList for various.
    
    
    JList EmpQualificationList = new JList ( qualification ) ;
    
    JList EmpDepartmentList = new JList ( Department ) ;
    
    
    //Decleration JCheckBox for Accepting the terms and conditions.
    
    
    JCheckBox EmpTermsConditionsCheckBox = new JCheckBox ( "Accept Terms and Conditions." , true ) ;
    
    
    //Decleration of JButton to submit the employee details.
    
    
    JButton EmpSubmitButton = new JButton ( new ImageIcon ( "submit.png" ) ) ;
    
    
    //File Writer tools.
    
    
    File filePath = new File ( "data.csv" ) ;
    
    
    //Constructor of a class code.
    
    
    code ( ) {
        
        
        // part of Employee Name.
        
        
        EmpNameLabel . setBounds ( 100 , 0 , 175 , 30 ) ;
        
        EmpNameValidLabel.setForeground ( Color.RED ) ;
        
        EmpNameValidLabel.setBounds ( 310 , 30 , 250 , 20 ) ;
        
        EmpNameTextField . setBounds ( 300 , 0 ,250 , 30 ) ;
        
        frame.add ( EmpNameLabel ) ;
        
        frame.add ( EmpNameTextField ) ;
        
        frame.add ( EmpNameValidLabel ) ;
        
        EmpNameTextField.getDocument().addDocumentListener(
                                                           
                                                           new DocumentListener ( ) {
            
            public void changedUpdate ( DocumentEvent documentEvent ) {
              
                if ( documentEvent.getDocument ( ) . getLength ( ) != 0 ) {
                    
                    frame.remove ( EmpNameValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpNameValidBool = true ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
                else {
                    
                    frame.add ( EmpNameValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpNameValidBool = false ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
            public void insertUpdate ( DocumentEvent documentEvent ) {
                
                if ( documentEvent.getDocument ( ) . getLength ( ) != 0 ) {
                    
                    frame.remove ( EmpNameValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpNameValidBool = true ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
                else {
                    
                    frame.add ( EmpNameValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpNameValidBool = false ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
            public void removeUpdate ( DocumentEvent documentEvent ) {
                
                if ( documentEvent.getDocument ( ) . getLength ( ) == 0 ) {
                    
                    frame.add ( EmpNameValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpNameValidBool = false ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
        } );
        
        
        //part of Employee Number.
        
        
        EmpNumberLabel . setBounds ( 100 , 50 , 175 , 30 ) ;
        
        EmpNumberTextField . setBounds ( 300 , 50 , 250 , 30 ) ;
        
        EmpNumberValidLabel.setForeground ( Color.RED ) ;
        
        EmpNumberValidLabel.setBounds ( 310 , 80 , 250 , 20 ) ;
        
        frame.add ( EmpNumberLabel ) ;
        
        frame.add ( EmpNumberTextField ) ;
        
        frame.add ( EmpNumberValidLabel ) ;
        
        
        EmpNumberTextField.getDocument().addDocumentListener(
                                                           
                                                           new DocumentListener ( ) {
            
            public void changedUpdate ( DocumentEvent documentEvent ) {
              
                if ( documentEvent.getDocument ( ) . getLength ( ) == 9 ) {
                    
                    frame.remove ( EmpNumberValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpNumberValidBool = true ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
                else {
                    
                    frame.add ( EmpNumberValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpNumberValidBool = false ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
            public void insertUpdate ( DocumentEvent documentEvent ) {
                
                if ( documentEvent.getDocument ( ) . getLength ( ) == 9 ) {
                    
                    frame.remove ( EmpNumberValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpNumberValidBool = true ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
                else {
                    
                    frame.add ( EmpNumberValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpNumberValidBool = false ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
            public void removeUpdate ( DocumentEvent documentEvent ) {
                
                if ( documentEvent.getDocument ( ) . getLength ( ) == 9 ) {
                    
                    frame.remove ( EmpNumberValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpNumberValidBool = true ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
                else {
                    
                    frame.add ( EmpNumberValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpNumberValidBool = false ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
        } );
        
        
        //part of Employee Gender.
        
        
        EmpGenderLabel.setBounds ( 100 , 100 , 175 , 30 ) ;
        
        EmpGenderMaleRadioButton.setBounds ( 300 , 100 , 85 , 30 ) ;
        
        EmpGenderFemaleRadioButton.setBounds ( 385 , 100 , 85 , 30 ) ;
        
        EmpGenderOthersRadioButton.setBounds ( 470 , 100 , 85 , 30 ) ;
        
        EmpGenderValidLabel.setForeground ( Color.RED ) ;
        
        EmpGenderValidLabel.setBounds ( 310 , 130 , 250 , 20 ) ;
        
        EmpGenderButtonGroup.add ( EmpGenderMaleRadioButton ) ;
        
        EmpGenderButtonGroup.add ( EmpGenderFemaleRadioButton ) ;
        
        EmpGenderButtonGroup.add ( EmpGenderOthersRadioButton ) ;
        
        EmpGenderMaleRadioButton.addItemListener (
                                                  
                                                  new ItemListener ( ) {
            
            public void itemStateChanged ( ItemEvent e ) {
                
                if ( e.getStateChange ( ) == 1 ) {
                    
                    frame.remove ( EmpGenderValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpGenderValidBool = true ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
        } ) ;
        
        EmpGenderFemaleRadioButton.addItemListener (
                                                  
                                                  new ItemListener ( ) {
            
            public void itemStateChanged ( ItemEvent e ) {
                
                if ( e.getStateChange ( ) == 1 ) {
                    
                    frame.remove ( EmpGenderValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpGenderValidBool = true ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
        } ) ;
        
        EmpGenderOthersRadioButton.addItemListener (
                                                  
                                                  new ItemListener ( ) {
            
            public void itemStateChanged ( ItemEvent e ) {
                
                if ( e.getStateChange ( ) == 1 ) {
                    
                    frame.remove ( EmpGenderValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpGenderValidBool = true ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
        } ) ;
        
        frame.add ( EmpGenderLabel ) ;
        
        frame.add ( EmpGenderMaleRadioButton ) ;
        
        frame.add ( EmpGenderFemaleRadioButton ) ;
        
        frame.add ( EmpGenderOthersRadioButton ) ;
        
        frame.add ( EmpGenderValidLabel ) ;
        
        
        //part of Employee Date Of Birth.
        
        
        EmpDOBLabel.setBounds ( 100 , 150 , 175 , 30 ) ;
        
        EmpDOBDateComboBox.setBounds ( 300 , 150 , 85 , 30 ) ;
        
        EmpDOBMonthComboBox.setBounds ( 385 , 150 , 85 , 30 ) ;
        
        EmpDOBYearComboBox.setBounds ( 470 , 150 , 85 , 30 ) ;
        
        EmpDOBValidLabel.setForeground ( Color.RED ) ;
        
        EmpDOBValidLabel.setBounds ( 310 , 180 , 250 , 20 ) ;
        
        EmpDOBDateComboBox.addItemListener (
                                            
                                            new ItemListener ( ) {
            
            public void itemStateChanged ( ItemEvent e ) {
                
                if ( EmpDOBDateComboBox.getSelectedIndex ( ) != 0 && EmpDOBMonthComboBox.getSelectedIndex ( ) != 0 && EmpDOBYearComboBox.getSelectedIndex ( ) != 0 ) {
                    
                    frame.remove ( EmpDOBValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpDOBValidBool = true ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
                else {
                    
                    frame.add ( EmpDOBValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpDOBValidBool = false ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
        } ) ;
        
        EmpDOBMonthComboBox.addItemListener (
                                            
                                            new ItemListener ( ) {
            
            public void itemStateChanged ( ItemEvent e ) {
                
                if ( EmpDOBDateComboBox.getSelectedIndex ( ) != 0 && EmpDOBMonthComboBox.getSelectedIndex ( ) != 0 && EmpDOBYearComboBox.getSelectedIndex ( ) != 0 ) {
                    
                    frame.remove ( EmpDOBValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpDOBValidBool = true ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
                else {
                    
                    frame.add ( EmpDOBValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpDOBValidBool = false ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
        } ) ;
        
        EmpDOBYearComboBox.addItemListener (
                                            
                                            new ItemListener ( ) {
            
            public void itemStateChanged ( ItemEvent e ) {
                
                if ( EmpDOBDateComboBox.getSelectedIndex ( ) != 0 && EmpDOBMonthComboBox.getSelectedIndex ( ) != 0 && EmpDOBYearComboBox.getSelectedIndex ( ) != 0 ) {
                    
                    frame.remove ( EmpDOBValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpDOBValidBool = true ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
                else {
                    
                    frame.add ( EmpDOBValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpDOBValidBool = false ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
        } ) ;
        
        frame.add ( EmpDOBLabel ) ;
        
        frame.add ( EmpDOBDateComboBox ) ;
        
        frame.add ( EmpDOBMonthComboBox ) ;
        
        frame.add ( EmpDOBYearComboBox ) ;
        
        frame.add ( EmpDOBValidLabel ) ;
        
        
        //part of Employee EmailId.
        
        EmpEmailLabel.setBounds ( 100 , 200 , 175 , 30 ) ;
        
        EmpEmailIdTextField.setBounds ( 300 ,200 , 250 , 30 ) ;
        
        EmpEmailValidLabel.setForeground ( Color.RED ) ;
        
        EmpEmailValidLabel.setBounds ( 310 , 230 , 250 , 20 ) ;
        
        EmpEmailIdTextField.getDocument().addDocumentListener(
                                                              new DocumentListener() {
            
            public void changedUpdate ( DocumentEvent documentEvent ) {
                
                String email = EmpEmailIdTextField.getText ( ) ;
                
                if ( ( email.contains ( ".com" ) || email.contains ( ".in" ) ) && ( email.contains ( "@" ) && ! ( email.contains ( " " ) ) ) ) {
                    
                    frame.remove ( EmpEmailValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpEmailValidBool = true ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
                else {
                    
                    frame.add ( EmpEmailValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpEmailValidBool = false ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
            public void insertUpdate ( DocumentEvent documentEvent ) {
                
                String email = EmpEmailIdTextField.getText ( ) ;
                
                if ( ( email.contains ( ".com" ) || email.contains ( ".in" ) ) && ( email.contains ( "@" ) && ! ( email.contains ( " " ) ) ) ) {
                    
                    frame.remove ( EmpEmailValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpEmailValidBool = true ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
                else {
                    
                    frame.add ( EmpEmailValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpEmailValidBool = false ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
            public void removeUpdate ( DocumentEvent documentEvent ) {
                
                String email = EmpEmailIdTextField.getText ( ) ;
                
                if (! ( ( email.contains ( ".com" ) || email.contains ( ".in" ) ) && ( email.contains ( "@" ) && ! ( email.contains ( " " ) ) ) ) ) {
                    
                    frame.add ( EmpEmailValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpEmailValidBool = false ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
                else if ( ( ( email.contains ( ".com" ) || email.contains ( ".in" ) ) && ( email.contains ( "@" ) && ! ( email.contains ( " " ) ) ) ) ) {
                    
                    frame.remove ( EmpEmailValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpEmailValidBool = true ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
        } ) ;
        
        frame.add ( EmpEmailLabel ) ;
        
        frame.add ( EmpEmailIdTextField ) ;
        
        frame.add ( EmpEmailValidLabel ) ;
        
        
        //part of Employee Address.
        
        
        EmpAddressLabel.setBounds ( 100 , 250 , 175 , 30 ) ;
        
        //EmpAddressTextArea.setRows ( 5 ) ;
        
        EmpAddressTextArea.setBounds ( 300 , 250 , 250 , 100 ) ;
        
        EmpAddressValidLabel.setForeground ( Color.RED ) ;
        
        EmpAddressValidLabel.setBounds ( 310 , 355 , 250 , 20 ) ;
        
        EmpAddressTextArea.getDocument().addDocumentListener(
                                                           
                                                           new DocumentListener ( ) {
            
            public void changedUpdate ( DocumentEvent documentEvent ) {
              
                if ( documentEvent.getDocument ( ) . getLength ( ) != 0 ) {
                    
                    frame.remove ( EmpAddressValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpAddressValidBool = true ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
                else {
                    
                    frame.add ( EmpAddressValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpAddressValidBool = false ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
            public void insertUpdate ( DocumentEvent documentEvent ) {
                
                if ( documentEvent.getDocument ( ) . getLength ( ) != 0 ) {
                    
                    frame.remove ( EmpAddressValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpAddressValidBool = true ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
                else {
                    
                    frame.add ( EmpAddressValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpAddressValidBool = false ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
            public void removeUpdate ( DocumentEvent documentEvent ) {
                
                if ( documentEvent.getDocument ( ) . getLength ( ) == 0 ) {
                    
                    frame.add ( EmpAddressValidLabel ) ;
                    
                    frame.revalidate ( ) ;
                    
                    frame.repaint ( ) ;
                    
                    EmpAddressValidBool = false ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
        } );

        
        frame.add ( EmpAddressLabel ) ;
        
        frame.add ( EmpAddressTextArea ) ;
        
        frame.add ( EmpAddressValidLabel ) ;
        
        
        //part of Employee Qualification.
        
        
        EmpQualificationLabel.setBounds (  100 , 380 , 175 , 30 ) ;
        
        EmpQualificationList.setBounds ( 300 , 380 , 175 , 70 ) ;
        
        EmpQualificationValidLabel.setForeground ( Color.RED ) ;
        
        EmpQualificationValidLabel.setBounds ( 310 , 455 , 250 , 20 ) ;
        
        EmpQualificationList.addListSelectionListener(new ListSelectionListener() {
                   
                    public void valueChanged(ListSelectionEvent e) {
                        
                        if ( EmpQualificationList.getSelectedIndex ( ) != -1 ) {
                            
                            frame.remove ( EmpQualificationValidLabel ) ;
                             
                             frame.revalidate () ;
                             
                             frame.repaint ( ) ;
                             
                             EmpQualificationValidBool = true ;
                             
                             SubmitButtonValidator( ) ;
                            
                        }
                        
                        else {
                            
                            frame.add ( EmpQualificationValidLabel ) ;
                             
                             frame.revalidate () ;
                             
                             frame.repaint ( ) ;
                             
                             EmpQualificationValidBool = false ;
                             
                             SubmitButtonValidator( ) ;
                            
                        }
                        
                    }
            
                });
        
        frame.add ( EmpQualificationLabel ) ;
        
        frame.add ( EmpQualificationList ) ;
        
        frame.add ( EmpQualificationValidLabel ) ;
        
        
        //part of a Employee Department.
        
        EmpDepartmentLabel.setBounds ( 100 , 480 , 175 , 30 ) ;
        
        EmpDepartmentList.setBounds ( 300 , 480 , 250 , 190 ) ;
        
        EmpDepartmentValidLabel.setForeground ( Color.RED ) ;
        
        EmpDepartmentValidLabel.setBounds ( 310 , 670 , 250 , 20 ) ;
        
        EmpDepartmentList.addListSelectionListener(new ListSelectionListener() {
                   
                    public void valueChanged(ListSelectionEvent e) {
                        
                       if ( EmpDepartmentList.getSelectedIndex( ) != -1 ) {
                           
                           frame.remove ( EmpDepartmentValidLabel ) ;
                            
                            frame.revalidate () ;
                            
                            frame.repaint ( ) ;
                            
                            EmpDepartmentValidBool = true ;
                            
                            SubmitButtonValidator( ) ;
                           
                       }
                        
                        else {
                            
                            frame.add ( EmpDepartmentValidLabel ) ;
                             
                             frame.revalidate () ;
                             
                             frame.repaint ( ) ;
                             
                             EmpDepartmentValidBool = false ;
                             
                             SubmitButtonValidator( ) ;
                            
                        }
                        
                    }
            
                });
        
        frame.add ( EmpDepartmentLabel ) ;
        
        frame.add ( EmpDepartmentList ) ;
        
        frame.add ( EmpDepartmentValidLabel ) ;
        
        
        //part of Employee Hobbies.
        
        
        EmpHobbyLabel.setBounds ( 100 , 690 , 175 , 30 ) ;
        
        EmpHobbyTextField.setBounds ( 300 , 690 , 250 , 30 ) ;
        
        frame.add ( EmpHobbyLabel ) ;
        
        frame.add ( EmpHobbyTextField ) ;
        
        
        //part of Employee Extra-Circular Activities.
        
        
        EmployExtraCALabel.setBounds ( 100 , 740 , 175 , 30 ) ;
        
        EmployExtraCATextField.setBounds ( 300 , 740 , 250 , 30 ) ;
        
        frame.add ( EmployExtraCALabel ) ;
        
        frame.add ( EmployExtraCATextField ) ;
        
        
        //part of Employee Accepting Terms and Conditons.
        
        
        EmpTermsConditionsCheckBox.setBounds ( 700 , 300 , 250 , 30 ) ;
        
        frame.add ( EmpTermsConditionsCheckBox ) ;
        
        EmpTermsConditionsCheckBox.addItemListener (
                                                    
                                                    new ItemListener ( ) {
            
            public void itemStateChanged ( ItemEvent e ) {
                
                if ( e.getStateChange ( ) == 1 ) {
                    
                    EmpTermsvalidBool = true ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
                else {
                    
                    EmpTermsvalidBool = false ;
                    
                    SubmitButtonValidator ( ) ;
                    
                }
                
            }
            
        } ) ;
        
        
        //part of Design and SetBounds of a jButton.
        
        
        EmpSubmitButton.setBounds ( 750 , 350 , 150 , 50 ) ;
        
        EmpSubmitButton.addActionListener ( new ActionListener ( ) {
            
            public void actionPerformed ( ActionEvent e ) {
                
                String data = "\n" ;
                
                data += EmpNameTextField.getText() ;
                
                data += "," ;
                
                data += EmpNumberTextField.getText() ;
                
                data += "," ;
                
                if ( EmpGenderMaleRadioButton.isSelected () ) {
                    
                    data += "Male" ;
                    
                }
                
                if ( EmpGenderFemaleRadioButton.isSelected () ) {
                    
                    data += "Female" ;
                    
                }
                
                if ( EmpGenderOthersRadioButton.isSelected () ) {
                    
                    data += "Others" ;
                    
                }
                
                data += "," ;
                
                data += EmpDOBDateComboBox.getItemAt ( EmpDOBDateComboBox.getSelectedIndex( ) ) ;
                
                data += "-" ;
                
                data += EmpDOBMonthComboBox.getItemAt ( EmpDOBMonthComboBox.getSelectedIndex( ) ) ;
                
                data += "-" ;
                
                data += EmpDOBYearComboBox.getItemAt ( EmpDOBYearComboBox.getSelectedIndex( ) ) ;
                
                data += "," ;
                
                data += EmpEmailIdTextField.getText( ) ;
                
                data += "," ;
                
                String address1 = EmpAddressTextArea.getText ( ) ;
                
                String[] address2 = address1.split ( "\n" ) ;
                
                for ( int i = 0 ; i < address2.length ; i++ ) {
                    
                    data += address2 [ i ] ;
                    
                    data += " " ;
                    
                }
                
                data += "," ;
                
                data += EmpQualificationList.getSelectedValue ( ) ;
                
                data += "," ;
                
                data += EmpDepartmentList.getSelectedValue ( ) ;
                
                data += "," ;
                
                String str = EmpHobbyTextField.getText ( ) ;
                
                if ( ! ( str.equals ( "Optional" ) ) ) {
                    
                    data += str ;
                    
                }
                
                data += "," ;
                
                str = EmployExtraCATextField.getText ( ) ;
                
                if ( ! ( str.equals ( "Optional" ) ) ) {
                    
                    data += str ;
                    
                }
                
                //System.out.println ( data ) ;
                
                try {
                    
                    FileWriter writer = new FileWriter ( filePath , true ) ;
                    
                    writer.write ( data ) ;
                    
                    writer.close ( ) ;
                     
                }
                
                catch ( Exception ex ) {
                    
                    System.out.println ( ex ) ;
                    
                }
                
                JOptionPane.showMessageDialog ( frame , "Responses saved Successfully." ) ;
                
                EmpNameTextField.setText ( "" ) ;
                
                EmpNumberTextField.setText ( "" ) ;
                
                EmpGenderButtonGroup.clearSelection ( ) ;
                
                EmpDOBDateComboBox.setSelectedIndex ( 0 ) ;
                
                EmpDOBMonthComboBox.setSelectedIndex ( 0 ) ;
                
                EmpDOBYearComboBox.setSelectedIndex ( 0 ) ;
                
                EmpEmailIdTextField.setText ( "" ) ;
                
                EmpAddressTextArea.setText ( "" ) ;
                
                EmpQualificationList.clearSelection ( ) ;
                
                EmpDepartmentList.clearSelection ( ) ;
                
                EmpHobbyTextField.setText ( "Optional" ) ;
                
                EmployExtraCATextField.setText ( "Optional" ) ;
                
            }
            
        } ) ;
        
        
        //Frame Functions to visible and size and Layout.
        
        
        JLabel VS = new JLabel ( "Designed by vamsi(popeye)" ) ;
        
        VS.setBounds ( 750 , 750 , 250 , 30 ) ;
        
        frame.add ( VS ) ;
        
        frame.setMinimumSize(new Dimension(1000, 820));
                
        frame . setSize ( 1000 , 820 ) ;
        
        frame . setLayout ( null ) ;
        
        frame . setVisible ( true ) ;
        
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE ) ;
        
    }
    
    
    //method to check booleans and make visible of Submit button.
    
    
    void SubmitButtonValidator ( ) {
        
        if ( EmpNameValidBool && EmpNumberValidBool && EmpGenderValidBool && EmpDOBValidBool && EmpEmailValidBool && EmpAddressValidBool && EmpQualificationValidBool && EmpDepartmentValidBool && EmpTermsvalidBool ) {
            
            frame.add ( EmpSubmitButton ) ;
            
            frame.revalidate ( ) ;
            
            frame.repaint ( ) ;
            
        }
        
        else {
            
            frame.remove ( EmpSubmitButton ) ;
            
        }
        
    }
    
    
    // main method of the code class.
    
    
    public static void main ( String... Args ) {
        
        new code ( ) ;
        
    }
    
}


//code written by popeye :)
