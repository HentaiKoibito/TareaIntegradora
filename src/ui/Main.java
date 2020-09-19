package ui;
import model.*;
public class Main{
	static Scanner Dokidoki = new Scanner(System.in);
	public static void main(String [] array){
		
	}
	public static string[] listaObjetos(string[]){
		for(int i=0;i<array.length;i++){
		System.out.prinln("ingrese el nombre del material "+(i+1));
		listaObjetos[i]=Dokidoki.next();
		return listaObjetos
		}
	}
		public static double[] precioObjetos(double[]){
			String[]onichichi=listaObjetos();
			int i=0;
			for(int j=0;j<array.length;j++){
			System.out.println("ingrese el precio del material "+listaObjetos[i]" en homecenter");
			precioObjetos[j]=Dokidoki.next();
			i++;
			}
			return precioObjetos
			
		}
		
		public static double[] precioObjetosDos(double[]){
			String[]onichichi=listaObjetos();
			for(int t=0;t<array.length;t++){
				System.out.println("ingrese el precio del material "+listaObjetos[i]" en la ferreteria del centro");
			precioObjetosDos[j]=Dokidoki.next();
			i++
			}
			return precioObjetosDos
				}
		
		public static double[] precioObjetosTres(double[]){
			String[]onichichi=listaObjetos();
			for(int y=0;y<array.length;y++){
				System.out.println("ingrese el precio del material "+listaObjetos[i]" en la ferreteria del barrio");
			precioObjetosTres[j]=Dokidoki.next();
			i++
			}
			return precioObjetosTres
			
		}
		
		public static double tipoObra(double num4){
			double num1=0, num2=0, num3=0;
			System.out.prinln("cuantos materiales se van a usar para la obra negra"");
			num1=Dokidoki.nextDouble();
			if(num1>0){
				num4=num4+1300000;
			}
		    System.out.println("cuantos materiales se van a usar para la obra blanca?");
			num2=Dokidoki.nextDouble();
			if(num2>0){
				num4=num4+2600000;
	             }
			System.out.println("cuantos materiales se van a usar para pintura?");
			num3=Dokidoki.nextDouble();
			if(num3>0){
				num4=num4+980000;
			}
			return tipoObra;
		}
		public static double[] precioParcial (double[]){
		
			Double[]onichichi=precioObjetos();
			Double[]onichichi=precioObjetosDos();
			Double[]onichichi=precioObjetosTres();
			for(int j=0;j<array.length;j++){
			if(precioObjetos[j]<precioObjetosDos[j]&&precioObjetosTres[j]){
					 precioParcial[j]=precioObjetos[j];
			}
			if(precioObjetosDos[j]<precioObjetos[j]&&precioObjetosTres){
				precioParcial[j]=precioObjetosDos[j];
			}
			if(precioObjetosTres[j]<precioObjetos[j]&&precioObjetosDos[j]){
				precioParcial[j]=precioObjetosTres[j];
			}
			
				 }
			return precioParcial
			}
			
			public static double precioUbicacion (double ubicacion){
				double lugar=0;
				double prezio=0;
				Double[]onichichi=precioParcial();
				for(int i=0;i<array.length;i++){
					prezio=prezio+precioParcial[j];
				}
				System.out.println("en que parte se ubica? digite 1 para norte, 2 para centro o 3 para sur");
				lugar=Dokidoki.nextDouble();
				if(lugar==1){
					if(prezio<80000){
						ubicacion=120000;
					}
					if(prezio<300000){
						ubicacion=28000;
					}
					if(prezio>=300000){
						ubicacion=0;
					}
				}
			if(lugar==2){
					if(prezio<80000){
						ubicacion=50000;
					}
					if(prezio<300000){
						ubicacion=0;
					}
					if(prezio>=300000){
						ubicacion=0;
					}
			}
			if(lugar==3){
					if(prezio<80000){
						ubicacion=120000;
					}
					if(prezio<300000){
						ubicacion=55000;
					}
					if(prezio>=300000){
						ubicacion=0;
					}
			}
			return ubicacion
			
		}
		public static void preioFinal(Scanner dokiDoki) {
	    	double precioTotal=0;
			string[]onichichi=listaObjetos  
		    Double[]onichichi=precioParcial();
			Double[]onichichi=ubicacion();
			Double[]onichihci=tipoObra();
			for(i=0;i<array.length;i++){
				System.out.prinln("Tendra que pagar por el material "+listaObjetos[i]);
				System.out.println(precioParcial[i]+" pesos");
			}
			for(j=0;j<array.length;j++){
				precioTotal=precioTotal+precioParcial[j];
			}
			System.out.println("el precio a pagar por todos los materiales es "+precioTotal+"y tendra que pagar "+ubicacion+" por domicilio y "+tipoObra "por la mano de obra");
		}
	}
}








