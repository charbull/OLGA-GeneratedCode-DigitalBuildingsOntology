package www.google.com.digitalbuildings._0_0_1.fields;

import digitalbuildings.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import www.google.com.digitalbuildings._0_0_1.subfields.IBypass;
import www.google.com.digitalbuildings._0_0_1.subfields.Bypass;
import www.google.com.digitalbuildings._0_0_1.subfields.IPercentage;
import www.google.com.digitalbuildings._0_0_1.subfields.Percentage;
import www.google.com.digitalbuildings._0_0_1.subfields.IValve;
import www.google.com.digitalbuildings._0_0_1.subfields.Valve;
import www.google.com.digitalbuildings._0_0_1.subfields.ISensor;
import www.google.com.digitalbuildings._0_0_1.subfields.Sensor;


@SuppressWarnings("serial")
public class Bypass_valve_percentage_sensor extends www.google.com.digitalbuildings._0_0_1.fields.Field implements IBypass_valve_percentage_sensor{

	IRI newInstance;
	public Bypass_valve_percentage_sensor(String namespace, String instanceId) {
		super(namespace, instanceId);

		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(this, RDF.TYPE, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1/fields#Bypass_valve_percentage_sensor"));
	}

	public IRI iri()
	{
		return newInstance;
	}


  public void addComposedOfBypass (IBypass parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), parameter);
	}

	public Set<IBypass> getComposedOfBypass (){
		Set<IBypass> ComposedOfBypass = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), null)
		.objects().forEach(action->{
			if(action instanceof Bypass) {
				ComposedOfBypass.add((Bypass)action);
			}
		});
		return ComposedOfBypass;
	}


  public void addComposedOfPercentage (IPercentage parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), parameter);
	}

	public Set<IPercentage> getComposedOfPercentage (){
		Set<IPercentage> ComposedOfPercentage = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), null)
		.objects().forEach(action->{
			if(action instanceof Percentage) {
				ComposedOfPercentage.add((Percentage)action);
			}
		});
		return ComposedOfPercentage;
	}


  public void addComposedOfSensor (ISensor parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), parameter);
	}

	public Set<ISensor> getComposedOfSensor (){
		Set<ISensor> ComposedOfSensor = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), null)
		.objects().forEach(action->{
			if(action instanceof Sensor) {
				ComposedOfSensor.add((Sensor)action);
			}
		});
		return ComposedOfSensor;
	}


  public void addComposedOfValve (IValve parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), parameter);
	}

	public Set<IValve> getComposedOfValve (){
		Set<IValve> ComposedOfValve = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), null)
		.objects().forEach(action->{
			if(action instanceof Valve) {
				ComposedOfValve.add((Valve)action);
			}
		});
		return ComposedOfValve;
	}

	public static Set<IBypass_valve_percentage_sensor> getAllBypass_valve_percentage_sensorsObjectsCreated(){
		Set<IBypass_valve_percentage_sensor> objects = new HashSet<>();
		objects = GLOBAL.model.filter(null, RDF.TYPE, GLOBAL.factory
		.createIRI("http://www.google.com/digitalbuildings/0.0.1/fields#Bypass_valve_percentage_sensor")).subjects().stream()
		.map(mapper->(IBypass_valve_percentage_sensor)mapper)
		.collect(Collectors.toSet());

		return objects;
	}
}