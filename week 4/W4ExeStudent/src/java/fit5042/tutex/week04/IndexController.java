/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit5042.tutex.week04;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
/**
 *
 * @author Pooja
 */
@Named(value = "indexController")
@RequestScoped
public class IndexController {
    private String pageTitle;
    public IndexController() {
    // Set the page title
        pageTitle = "Viewing Movies" + " | " + MovieApplication.APP_TITLE;
    }
    public String getPageTitle() {
        return pageTitle;
    }
    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }
}
