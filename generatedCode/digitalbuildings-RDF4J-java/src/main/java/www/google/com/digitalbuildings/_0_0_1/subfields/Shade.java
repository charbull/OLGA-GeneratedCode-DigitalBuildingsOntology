package www.google.com.digitalbuildings._0_0_1.subfields;

import digitalbuildings.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
* Class Shade 
* Window covering.
*/
@SuppressWarnings("serial")
public class Shade extends www.google.com.digitalbuildings._0_0_1.subfields.Component implements IShade{

	IRI newInstance;
	public Shade(String namespace, String instanceId) {
		super(namespace, instanceId);

		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(this, RDF.TYPE, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Shade"));
	}

	public IRI iri()
	{
		return newInstance;
	}

	public static Set<IShade> getAllShadesObjectsCreated(){
		Set<IShade> objects = new HashSet<>();
		objects = GLOBAL.model.filter(null, RDF.TYPE, GLOBAL.factory
		.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Shade")).subjects().stream()
		.map(mapper->(IShade)mapper)
		.collect(Collectors.toSet());

		return objects;
	}
}