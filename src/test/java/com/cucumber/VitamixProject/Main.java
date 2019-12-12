package com.cucumber.VitamixProject;

public class Main {

	public static void main(String[] args) throws Throwable {
		Test_Steps obj = new Test_Steps();
		
		obj.i_launch_google_chrome_browser();
		
//		UNCOMMENT THIS LINE OF CODE BELOW TO RUN THE TEST IN FIREFOX BROWSER WHILE CODES TO LAUNCH CHROME AND IE BROWSERS ARE COMMENTED
//		obj.i_launch_mozila_firefox_browser();
//		
//		UNCOMMENT THIS LINE OF CODE BELOW TO RUN THE TEST IN IE BROWSER WHILE CODES TO LAUNCH CHROME AND FIREFOX BROWSERS ARE COMMENTED
//		obj.i_launch_IE_browser();
		
//		THE LIST OF CODES/METHODS BELOW WILL TEST/RUN THE "CHANGE PASSWORD FUNCTIONALITY" AND DELETE USER ACCOUNT
		
		obj.i_am_on_the_homepage();
		obj.i_click_on_allow_all_cookies_link();
		obj.i_click_my_Account_link();
		obj.i_click_create_an_account_link();
		obj.i_fill_the_form();
		obj.i_click_the_create_account_button();
		obj.my_account_should_be_created();
		obj.i_click_the_account_information_link();
		obj.i_click_change_password();
		obj.i_enter_my_current_password();
		obj.i_enter_my_new_password();
		obj.i_repeat_my_new_password();
		obj.i_click_the_change_password_button();
		obj.i_click_on_save_changes_button();
		obj.my_password_should_be_changed();
		obj.i_click_the_account_information_link();
		obj.i_click_on_Delete_My_Online_Account_link();
		obj.i_type_DELETE();
		obj.i_click_the_delete_button();
		obj.my_account_should_be_deleted();
		obj.TearDown();

		
        obj.i_launch_google_chrome_browser();
		
//		obj.i_launch_mozila_firefox_browser();
		
//		obj.i_launch_IE_browser();
		
//		THE LIST OF CODES/METHODS BELOW WILL TEST/RUN THE "REGISTER NEW USER/CREATE AN ACCOUNT FUNCTIONALITY" AND DELETE USER ACCOUNT
		
		obj.i_am_on_the_homepage();
		obj.i_click_on_allow_all_cookies_link();
		obj.i_click_my_Account_link();
		obj.i_click_create_an_account_link();
		obj.i_fill_the_form();
		obj.i_click_the_create_account_button();
		obj.my_account_should_be_created();
		obj.i_click_the_account_information_link();
		obj.i_click_on_Delete_My_Online_Account_link();
		obj.i_type_DELETE();
		obj.i_click_the_delete_button();
		obj.my_account_should_be_deleted();
		obj.TearDown();
		
	}

}
