# megaventory-project

Project is done in java language and used HttpClient. Project has one dependencey to convert Java Objects to JSON.

#### pom.xml 
<dependency>
      <groupId>com.fasterxml.jackson.core</groupId>
      <artifactId>jackson-databind</artifactId>
      <version>2.13.1</version>
</dependency>


It is a simple project and easy to understand has different class entity 


a. Product:
SKU: 1112256 
Description: Nike shoes
Sales Price: 99.99 
Purchase Price: 44.99  

b. Client:
Name: babis   
E-mail: babis@exampletest.com 
Shipping Address: Example 8, Athens 
Phone: 1235698967  

c. Inventory Location:
Abbreviation: Test
Name: Test Project Location
Address: Example 20, Athens 

d. Tax: 
Name: VAT
Description: VAT GR
Value: 24%

e. Discount
Name: Loyalty
Description: Loyalty Customer Discount
Value: 50%


3. Create a Sales Order with Verified status, using the Client, Product and Location you inserted, and applying the Tax and Discount you inserted. 



