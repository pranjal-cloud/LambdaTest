/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * PetClinic Spring Boot Application.
 *
 * @author Dave Syer
 *
 */
@SpringBootApplication
public class PetClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetClinicApplication.class, args);
           
        ChromeDriver driver = new ChromeDriver();

    //Open Url 
    driver.get("https://www.lambdatest.com/selenium-playground/");

    //Click on simple form demo
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();

    //Validate url
    driver. getCurrentUrl(); 

    //Create a variable
     String s=new String ("Welcome to Lambda Test");
     
    //Use this variable to enter values in the “Enter Message” text box.
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/div/div[1]/input")).sendKeys("Enter Message");

    //Click “Get Checked Value”.
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/div/div[1]/button")).click();

    //Verify if same text is displayed
    List<WebElement> l= driver.findElements(By.xpath("//*[contains(text(),'Enter Message')]"));
    // verify list size
      if ( l.size() > 0){
         System.out.println("Text: " + t + " is present. ");
      } else {
         System.out.println("Text: " + t + " is not present. ");
      } 
        
        
        
    }

}
