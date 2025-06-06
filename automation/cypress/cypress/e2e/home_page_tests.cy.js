describe('Home page tests', () => {
  beforeEach(() => {
  cy.visit('http://uitestingplayground.com')
  })
  
  it('Open Home page, check title', () => {
    cy.get('title').should('have.text', 'UI Test Automation Playground');
})
    
  it('Open Home page, go to "Dynamic ID" page, check title', () => {
    cy.get('#overview div:nth-child(1) .row:nth-child(1) .col-sm:nth-child(1) h3 a').click()
    cy.get('title').should('have.text', 'Dynamic ID');

  })

  it('Open Home page, go to "Class Attribute" page, check title', () => {
    cy.get('#overview div:nth-child(1) .row:nth-child(1) .col-sm:nth-child(2) h3 a').click()
    cy.get('title').should('have.text', 'Class Attribute');
  })

  it('Open Home page, go to "Hidden Layers" page, check title', () => {
    cy.get('#overview div:nth-child(1) .row:nth-child(1) .col-sm:nth-child(3) h3 a').click()
    cy.get('title').should('have.text', 'Hidden Layers');
  })
  
  it('Open Home page, go to "Scrollbars" page, check title', () => {
    cy.get('#overview div:nth-child(1) .row:nth-child(3) .col-sm:nth-child(1) h3 a').click()
    cy.get('title').should('have.text', 'Scrollbars');
  })

  it('Open Home page, go to "Dynamic Table" page, check title', () => {
    cy.get('#overview div:nth-child(1) .row:nth-child(3) .col-sm:nth-child(2) h3 a').click()
    cy.get('title').should('have.text', 'Dynamic Table');
  })

  it('Open Home page, go to "Progress Bar" page, check title', () => {
    cy.get('#overview div:nth-child(1) .row:nth-child(3) .col-sm:nth-child(4) h3 a').click()
    cy.get('title').should('have.text', 'Progress Bar');
  })

})
