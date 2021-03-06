package www.google.com.digitalbuildings._0_0_1.subfields;

import digitalbuildings.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
* Class Economizer 
* Process or component responsible for the utilization of free cooling.
*/
@SuppressWarnings("serial")
public class Economizer extends www.google.com.digitalbuildings._0_0_1.subfields.Descriptor implements IEconomizer{

	IRI newInstance;
	public Economizer(String namespace, String instanceId) {
		super(namespace, instanceId);

		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(this, RDF.TYPE, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Economizer"));
	}

	public IRI iri()
	{
		return newInstance;
	}

	public static Set<IEconomizer> getAllEconomizersObjectsCreated(){
		Set<IEconomizer> objects = new HashSet<>();
		objects = GLOBAL.model.filter(null, RDF.TYPE, GLOBAL.factory
		.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Economizer")).subjects().stream()
		.map(mapper->(IEconomizer)mapper)
		.collect(Collectors.toSet());

		return objects;
	}
}