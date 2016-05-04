# VaccineDistributionProblem
##Pre-requisites
 *Java SWING
 *Java development ID

##Problem Statement
The objective of this research project is to build a vaccine inventory management and distribution system that will 
operate at the national, state and local levels. The methodology to accomplish this task is to use the application 
engineering technology to improve the efficiency, accountability and the ability to respond to safety problems and 
public health crisis. 

##Soution
The solution is to come up with software implementation of the solution and to be able to 
address the vaccine, vaccine distribution, provider ordering (hospitals and clinics), and the operation of the national 
stockpile and operation research on the vaccine ordering in each state.

##Key Entities
1. Center for Disease Control (CDC): Receive vaccine order from individual state Public Health Department (PHD) for vaccine. Orders are approved by CDC according to state allocation and passed on to national distributor for shipping directly to Providers such as hospitals, pharmacies, clinics, etc. (referred to as sites). The CDC keeps track of available inventory on a daily basis and uses a formula to determine how to allocate vaccines supply to sites. The formula is based on the population size of each state. A site can only order from the allocated quantity for that state. If the limit is reached for that state then the order is delayed or rejected.

2. Distributor: A single national distributor responsible for shipping to registered clinics and hospitals. Satellite clinics receive their supply from their affiliated hospitals. The distributor interacts with vaccine manufactures and ship through their distribution centers which are located in different regions of the country. Distributor bills providers. 

3. Department of Public Health: Receives orders from registered sites. It is responsible for reviewing and approving site requests for vaccine. Approved requests are forwarded to the CDC for approval and shipping. The state keeps track of registered sites. Only registered site can order vaccine. 

4. Provider: Prepares and submits orders to the PHD for approval. The distributor will ship directly to the site. Maintains vaccine inventory for its satellite clinics. Provider billed by the distributor. Providers schedule their orders: monthly or biweekly depending on their anticipated demand forecast. 

5. Satellite Clinics: Maintains its own vaccine inventory 

##Object Model Diagram
![alt text](https://github.com/bansalrachita/VaccineDistributionProblem/tree/master/NationalVaccineDistributionSystem/src/images/bojectmodel.png"object model")
  
