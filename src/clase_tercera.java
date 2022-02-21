
//*@Author AlejandroCastro
//*@Version 0.1
//*@Param sirveParaJuntarLasDosClasesCreadasLaPadreYLaHija
//*@return devuelveLaHabilidadDeMonoVoladorQueEsMirarDeLaSegundaClase
//*@Since 21/02/2022 , Hora12:25
//





public class clase_tercera {

	public static void main(String[] args) {
		
		Segunda_clase monoVolador = new Segunda_clase();
		
		monoVolador.setName("Monito Volador");
		System.out.println(monoVolador.getName());
		monoVolador.getMirar();

	}

}
