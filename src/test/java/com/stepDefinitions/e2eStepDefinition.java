package com.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class E2EStepDefinition {

	public E2EStepDefinition(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// create project
	@FindBy(xpath = "//button[text()='Add Project']")
	private WebElement addProjectButton;

	@FindBy(xpath = "(//label[text()='Project Name*']/following::textarea)[1]")
	private WebElement projectNameTextBox;

	@FindBy(id = "slrObjective")
	private WebElement projectDescriptionTextBox;

	@FindBy(xpath = "//button[normalize-space()='Create']")
	private WebElement createButton;

	// Toaster message
	@FindBy(xpath = "//p[text()='success']")
	private WebElement createToasterMessage;

	// BackButton click
	@FindBy(xpath = "//p[text()='Home']")
	private WebElement projectbackbtn;

	// collab
	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	private WebElement addcollaborators;

	// Assign_Button
	@FindBy(xpath = "//p[text()='Assign']")
	private WebElement assignbtn;

	// Bypass screening process
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement Bypassscreeningprocess;

	// Add field button
	@FindBy(xpath = "//*[text()='Add Field']")
	private WebElement addfieldbutton;

	// addfieldtext
	@FindBy(id = "name")
	private WebElement addfieldtext;

	// addfielddropdown
	@FindBy(name = "addOption")
	private WebElement addfielddropdown;


	@FindBy(xpath = "//button[@aria-label='Add Option']")
	private WebElement Addbtn;


	// savedropbtn
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement save;


	// Project_edit
	@FindBy(xpath = "(//button[@title='Edit Project'])[1]")
	private WebElement pjedit;

	// Projectpage_pjeditcollaborators
	@FindBy(xpath = "//button[@title='Edit Collaborators'][1]")
	private WebElement pjeditcollaborators;

	// projectpage_pjduplicate
	@FindBy(xpath = "(//button[@title='Duplicate Project'])[1]")
	private WebElement pjduplicatebtn;


	// project-Pjduplicate_Alert
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement pjduplicatealert;

	// pjcreate
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement Alertcreatebtn;

	// pjdelete
	@FindBy(xpath = "//button[@title='Delete']")
	private WebElement pjdelete;

	//
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement pjdeletebtn;

	// newly added
	@FindBy(id = "populationInclusionCriteria")
	private WebElement Population_Included;

	@FindBy(id = "interventionInclusionCriteria")
	private WebElement Intervention_Included;

	@FindBy(id = "outcomeInclusionCriteria")
	private WebElement Comparator_Included;

	@FindBy(id = "studyDesignInclusionCriteria")
	private WebElement StudyCome_Included;

	// toaster edit

	@FindBy(xpath = "//p[text()='Project added successfully']")
	private WebElement Createprojecttoaster;

	@FindBy(xpath = "//p[text()='Project updated successfully']")
	private WebElement Edit_toaster;

	// search-Pubmed
	@FindBy(xpath = "//input[@placeholder='Keywords Search']")
	private WebElement keywordsearch;
	
	@FindBy(xpath = "(//div[@class='MuiBox-root css-703lyh']//button)[2]")
	private WebElement searchbtn;
	
	@FindBy(xpath = "(//div[@class='MuiBox-root css-1yp4ln']//button)[2]")
	private WebElement clickimport;

	// Toaster message
	@FindBy(xpath = "//p[text()='Articles imported successfully']")
	private WebElement ArticlesimporttoasterMessage;

	// Search page toaster Apply click

	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement importarticlespopupClick;

	// Dedup page

	@FindBy(xpath = "//button[text()='Add to Screening']")
	private WebElement addtoScreening;

	@FindBy(xpath = "//p[text()='Duplicate detection completed successfully.']")
	private WebElement dedupToaster;

	@FindBy(xpath = "//p[text()='Articles are added to screening successfully']")
	private WebElement addscreeningToaster;

	// TA
	@FindBy(xpath = "//button[text()='Request ML Predictions']")
	private WebElement requestmlPrediction;

	@FindBy(xpath = "(//div[contains(@class,'flexCenterCenter StatusButton_statusButton__ceP2v')]//button)[1]")
	private WebElement relevantbtn;

	// FT
	@FindBy(xpath = "(//div[@class='StepIcon_step-frame__FNd5J StepIcon_right-group__YphNf']//div)[2]")
	private WebElement fulltext;

	// Extract
	@FindBy(xpath = "//span[text()='Click here']")
	private WebElement extarctStepper;

	@FindBy(xpath = "//input[@type='file']")
	private WebElement extractUploadbtn;

	@FindBy(xpath = "//p[text()='Pdf Uploaded Successfully']")
	private WebElement uploadToaster;

	@FindBy(xpath = "//p[text()='Generate']")
	private WebElement generate;

	// articlesummary
	@FindBy(xpath = "(//button[@role='tab'])[2]")
	private WebElement articlesummary;

	// viewreport
	@FindBy(xpath = "(//div[@class='MuiBox-root css-6rc8sp']//button)[3]")
	private WebElement viewreport;

	// Multiliterature
	@FindBy(xpath = "//button[text()='Multi-Literature Summary']")
	private WebElement multiliterature;

	// selectall
	@FindBy(xpath = "//button[text()='Select All']")
	private WebElement selectall;

	// generateliteraturesummary
	@FindBy(xpath = "//button[text()='Generate Literature Summary']")
	private WebElement generateliteraturesummary;

	// Wait for save btn enable
	@FindBy(xpath = "(//*[@type='button'])[18]")
	private WebElement savebtn;

	// Reporttemplate btn click
	@FindBy(xpath = "//button[text()='Report Templates']")
	private WebElement reportTemplate;

	// Generate btn
	@FindBy(xpath = "//button[text()='Generate']")
	private WebElement clinicalOverviewGenerateBtn;
	
	// Clinical Overview Toaster
	@FindBy(xpath = "//p[text()='Clinical Overview Report generated successfully']")
	private WebElement clinicalOverviewToatser;
	
	// save
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement clinicalOverviewSave;

	// saveToaster
	@FindBy(xpath = "//p[text()='Clinical Overview Report saved successfully.']")
	private WebElement clinicalOverviewReportToatser;

}
