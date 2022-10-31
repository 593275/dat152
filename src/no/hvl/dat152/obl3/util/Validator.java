package no.hvl.dat152.obl3.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class Validator {
    
    
    
    public static String validString(String parameter) {
        return parameter != null ? parameter : "null";
    }
    

    public static String validPassword(String parameter) {
        
        boolean validPassword = isValidPassword(parameter);
        if(validPassword) {
            
            return parameter; 
                        
        } else {
            
            parameter = null;
        }
        
        return parameter;
                
                
    }
    
 public static String validUsername(String parameter) {
        
        boolean validUsername = isValidUsername(parameter);
        if(validUsername) {
            
            return parameter; 
                        
        } else {
            
            parameter = null;
        }
        
        return parameter;
                
                
    }
    
    
    public static boolean isValidPassword(String password)
    {
            boolean isValid = true;
            if (password.length() > 15 || password.length() < 8)
            {
                    isValid = false;
            }
            String upperCaseChars = "(.*[A-Z].*)";
            if (!password.matches(upperCaseChars ))
            {
                    isValid = false;
            }
            String lowerCaseChars = "(.*[a-z].*)";
            if (!password.matches(lowerCaseChars ))
            {
                    isValid = false;
            }
            String numbers = "(.*[0-9].*)";
            if (!password.matches(numbers ))
            {
                    isValid = false;
            }
            String specialChars = "(.*[@,#,$,%].*$)";
            if (!password.matches(specialChars ))
            {
                    isValid = false;
            }
            return isValid;
    }
    
    public static boolean isValidUsername(String username)
    {
            boolean isValid = true;
            if (username.length() > 15 || username.length() < 8)
            {
                    isValid = false;
            }
            String upperCaseChars = "(.*[A-Z].*)";
            if (!username.matches(upperCaseChars ))
            {
                    isValid = false;
            }
            String lowerCaseChars = "(.*[a-z].*)";
            if (!username.matches(lowerCaseChars ))
            {
                    isValid = false;
            }
            String numbers = "(.*[0-9].*)";
            if (!username.matches(numbers ))
            {
                    isValid = false;
            }
            
            return isValid;
    }
    
    public static boolean isCSRFTokenInvalid(HttpServletRequest r) {
        String x = "";
        try {
            x = (String) r.getSession().getAttribute("AntiCSRFToken");
        } catch (NullPointerException e) {
            return true;
        }
        String y = r.getParameter("AntiCSRFToken");
        return !x.equals(y);
    }
    
    public static String getCookieValue(HttpServletRequest request,
            String cookieName) {

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals(cookieName)) {
                    return c.getValue();
                }
            }
        }
        return null;
    }
}