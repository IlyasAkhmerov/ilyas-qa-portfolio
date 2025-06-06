 /// <reference types="cypress" />
import {ScrollbarsPage} from '../page-objects/scrollbars-page'
import {HomePage} from '../page-objects/home-page'

describe('Scrollbars page tests', () => {
    const scrollbarsPage = new ScrollbarsPage()
    const homePage = new HomePage()
    beforeEach(() => {
      cy.visit('http://uitestingplayground.com/')
    })

    it('Open Srollbars page, check title', () => {
      homePage.clickScrollbarsLink()   
      scrollbarsPage.getTitle()
      .should('eq', 'Scrollbars')
    })

    it('Open home page, go to "Scrollbars", click hidden button', () => {
       homePage.clickScrollbarsLink()
       scrollbarsPage.clickHiddenButton()
    })
 })