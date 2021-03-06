package www.google.com.digitalbuildings._0_0_1.subfields;

import digitalbuildings.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
* Class Building 
* Applies to the entire building or group of zones within building (e.g. Building_Air_Static_Pressure_Sensor)
*/
@SuppressWarnings("serial")
public class Building extends www.google.com.digitalbuildings._0_0_1.subfields.Descriptor implements IBuilding{

	IRI newInstance;
	public Building(String namespace, String instanceId) {
		super(namespace, instanceId);

		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(this, RDF.TYPE, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Building"));
	}

	public IRI iri()
	{
		return newInstance;
	}

	public static Set<IBuilding> getAllBuildingsObjectsCreated(){
		Set<IBuilding> objects = new HashSet<>();
		objects = GLOBAL.model.filter(null, RDF.TYPE, GLOBAL.factory
		.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Building")).subjects().stream()
		.map(mapper->(IBuilding)mapper)
		.collect(Collectors.toSet());

		return objects;
	}
}