Feature: To Check whether home page has New In under Women


@Sanity
Scenario:
Validate the New In functionality

Given To Launch the ASOS Browser
When To Mousehover  New In functionality
And To click the options clothing under New In Dropdown
And Click on tops options under categories  
Then Click on first image

@Regression
Scenario:
To check Home page has Dresses and Validate the Trending now functionality under dresses option

Given To Launch the ASOS Browser
When To Mousehover Dresses functionality
And To click Trending now options under sundresses
And Click size dropdown and select 2XS option
Then click on the second image

Scenario Outline:
To validate sign in functionality in home page

When To add datas in "<emailfield>" email field
And To add datas in "<passwordfield>" password field
Then click on Sign In button 

Examples:
|emailfield|passwordfield|
|flash@gmail.com|flash23|
|preethii@gmail.com|preethi123|
|abcd@gmail.com|abcd123|