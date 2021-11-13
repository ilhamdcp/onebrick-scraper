# README
---
##
Webscraping program to retrieve list of elements from [Tokopedia](https://tokopedia.com)
and generate it into csv

## Prerequisites
This program is intended to run on Chrome. Before running 
the program, please do check the Chrome version that you 
are using and download the appropriate [chromedriver](https://chromedriver.chromium.org/).
Replace the current chromedriver with the existing one
---
## How to run
Execute through the main function inside the `Main.java`.
This program uses RequestModel as its input.
- `productType` is used to specify the category of product that wanted to be scraped.
  Currently, there is only phone category available inside this program.
- `productEntities` is used to pass into the generate csv use case
- `limit` is used to specify the max number of products that want to be scraped
- `numberOfPage` is used to specify the number of page that that wanted to be scraped.

**NOTE: if limit and `numberOfPage` are specified, then the program will read from the `numberOfPage` attribute**

---
## Blocker
The program currently cannot navigate to the product detail page because the `anchor` tags navigate
to the Tokopedia backend services with required cookies. Only after then, redirected to PDP.
This blocker resulting in rating and product description could not be generated.
