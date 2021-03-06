package www.google.com.digitalbuildings._0_0_1.subfields;

import digitalbuildings.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
* Class Occupied 
* State of being within scheduled (time of day or week) run-time parameters.
*/
@SuppressWarnings("serial")
public class Occupied extends www.google.com.digitalbuildings._0_0_1.subfields.Descriptor implements IOccupied{

	IRI newInstance;
	public Occupied(String namespace, String instanceId) {
		super(namespace, instanceId);

		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(this, RDF.TYPE, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Occupied"));
	}

	public IRI iri()
	{
		return newInstance;
	}

	public static Set<IOccupied> getAllOccupiedsObjectsCreated(){
		Set<IOccupied> objects = new HashSet<>();
		objects = GLOBAL.model.filter(null, RDF.TYPE, GLOBAL.factory
		.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Occupied")).subjects().stream()
		.map(mapper->(IOccupied)mapper)
		.collect(Collectors.toSet());

		return objects;
	}
}