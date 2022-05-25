package com.entelgy.payload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication  // hace un scaneo en los paquetes de este mismo con @ComponentScan
public class PayloadApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayloadApplication.class, args);

		//AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class); // probar los beans
	/*	
		Data_salida datasalida=ctx.getBean("data_salida",Data_salida.class);
		Datos_extra datos_extra=ctx.getBean("datos_extra",Datos_extra.class);
		Tiempo tiempo=ctx.getBean("tiempo",Tiempo.class);
		User usuario =ctx.getBean("user",User.class); //probar los beans
		Data_entrada pay=ctx.getBean("paypage",Data_entrada.class);
*/
       /* for (String bean_name : ctx.getBeanDefinitionNames()) { //ver nombre de beans
            System.out.println(":: " + bean_name);
        }
        ctx.close();
	*/
		//System.out.println("Probando tiempo:: " + tiempo.obtenerfecha());
		//System.out.println("Probando paypage:: " + pay.getSupport().getText());
	
	}

}

