 /// <reference types="cypress" />
 export class ClassAttributePage {
    
    getTitle(){
        return cy.title('section .container h3');
    }
    
    clickButton(){
        cy.get("button.btn-primary")
        .click();
        
    }

    verifyAlertText(expectedText) {
        cy.on('window:alert', (text) => {
            expect(text).to.equal(expectedText);
        });
    }

 }