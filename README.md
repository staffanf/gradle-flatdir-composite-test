# gradle-flatdir-composite-test
Non working example of composite builds with flatDir repositories 
using classifiers for 

* Executing `gw run` in App will work and pull latest changes from Base
* Executing `gw release` in App will work _NOT_ work since there is no way of resolving a module with classifier to a specific project configuration 
