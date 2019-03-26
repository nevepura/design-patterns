Abstract factory example. 

Hyerarchy
	abstract factory: Fashion;
	concrete factories: ElegantFashion, ComfyFashion;
	abstract products: Hat, Footwear;
	concrete products: (ElegantHat, ComfyHat), (ElegantFootwear, ComfyFootwear).
	client: Client

How it works
	The client creates an istance of concrete factory (Elegant of Comfy fashion). On creation, a Hat and Footwear are created, according to the fashion selected: these can be seen using the Info() method, which is found in the interfaces Hat and Footwear.

I have achieved to give the client proper access to datas throuch the abstract factory and abstract products. 
Code could be improved changing the protected fields in Fashion to private, and using setter methods, but that goes out the interest of testing Abstract Factory.