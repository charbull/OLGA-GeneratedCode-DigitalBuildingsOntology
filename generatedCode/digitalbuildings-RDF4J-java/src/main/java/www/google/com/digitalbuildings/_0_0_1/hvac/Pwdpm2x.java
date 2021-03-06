package www.google.com.digitalbuildings._0_0_1.hvac;

import digitalbuildings.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import www.google.com.digitalbuildings._0_0_1.IMonitoring;
import www.google.com.digitalbuildings._0_0_1.Monitoring;
import www.google.com.digitalbuildings._0_0_1.fields.IProcess_water_differential_pressure_sensor_1;
import www.google.com.digitalbuildings._0_0_1.fields.Process_water_differential_pressure_sensor_1;
import www.google.com.digitalbuildings._0_0_1.fields.IProcess_water_differential_pressure_sensor_2;
import www.google.com.digitalbuildings._0_0_1.fields.Process_water_differential_pressure_sensor_2;

/**
* Class Pwdpm2x 
* Differential pressure monitoring for 2 process water headers.
*/
@SuppressWarnings("serial")
public class Pwdpm2x extends www.google.com.digitalbuildings._0_0_1.Monitoring implements IPwdpm2x{

	IRI newInstance;
	public Pwdpm2x(String namespace, String instanceId) {
		super(namespace, instanceId);

		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(this, RDF.TYPE, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1/hvac#Pwdpm2x"));
	}

	public IRI iri()
	{
		return newInstance;
	}


  public void addUsesProcess_water_differential_pressure_sensor_1 (IProcess_water_differential_pressure_sensor_1 parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#uses"), parameter);
	}

	public Set<IProcess_water_differential_pressure_sensor_1> getUsesProcess_water_differential_pressure_sensor_1 (){
		Set<IProcess_water_differential_pressure_sensor_1> UsesProcess_water_differential_pressure_sensor_1 = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#uses"), null)
		.objects().forEach(action->{
			if(action instanceof Process_water_differential_pressure_sensor_1) {
				UsesProcess_water_differential_pressure_sensor_1.add((Process_water_differential_pressure_sensor_1)action);
			}
		});
		return UsesProcess_water_differential_pressure_sensor_1;
	}


  public void addUsesProcess_water_differential_pressure_sensor_2 (IProcess_water_differential_pressure_sensor_2 parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#uses"), parameter);
	}

	public Set<IProcess_water_differential_pressure_sensor_2> getUsesProcess_water_differential_pressure_sensor_2 (){
		Set<IProcess_water_differential_pressure_sensor_2> UsesProcess_water_differential_pressure_sensor_2 = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#uses"), null)
		.objects().forEach(action->{
			if(action instanceof Process_water_differential_pressure_sensor_2) {
				UsesProcess_water_differential_pressure_sensor_2.add((Process_water_differential_pressure_sensor_2)action);
			}
		});
		return UsesProcess_water_differential_pressure_sensor_2;
	}

	public static Set<IPwdpm2x> getAllPwdpm2xsObjectsCreated(){
		Set<IPwdpm2x> objects = new HashSet<>();
		objects = GLOBAL.model.filter(null, RDF.TYPE, GLOBAL.factory
		.createIRI("http://www.google.com/digitalbuildings/0.0.1/hvac#Pwdpm2x")).subjects().stream()
		.map(mapper->(IPwdpm2x)mapper)
		.collect(Collectors.toSet());

		return objects;
	}
}