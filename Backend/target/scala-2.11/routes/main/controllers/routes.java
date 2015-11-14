
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Other/activator-1.3.6-minimal/socializer/conf/routes
// @DATE:Sat Nov 14 11:41:40 MSK 2015

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseRegistration Registration = new controllers.ReverseRegistration(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAuthentication Authentication = new controllers.ReverseAuthentication(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseRegistration Registration = new controllers.javascript.ReverseRegistration(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAuthentication Authentication = new controllers.javascript.ReverseAuthentication(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
