Feature: Lumosys Login


  Scenario: Succesful Login with multiple results
    Given I have opened the Lumosys site
    When I Login with an exist user
    Then I validate there are Login
    
    Scenario: usability of submenus charges, inquiries, payments
    Given I enter and use submenu charges
    When After making a charge, I will look for the charge
    