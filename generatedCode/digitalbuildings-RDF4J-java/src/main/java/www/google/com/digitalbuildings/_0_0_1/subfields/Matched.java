package www.google.com.digitalbuildings._0_0_1.subfields;

import digitalbuildings.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
* Class Matched 
* A collection of things that are put together as being equal, similar, or complementary.
*/
@SuppressWarnings("serial")
public class Matched extends www.google.com.digitalbuildings._0_0_1.subfields.Descriptor implements IMatched{

	IRI newInstance;
	public Matched(String namespace, String instanceId) {
		super(namespace, instanceId);

		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(this, RDF.TYPE, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Matched"));
	}

	public IRI iri()
	{
		return newInstance;
	}

	public static Set<IMatched> getAllMatchedsObjectsCreated(){
		Set<IMatched> objects = new HashSet<>();
		objects = GLOBAL.model.filter(null, RDF.TYPE, GLOBAL.factory
		.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Matched")).subjects().stream()
		.map(mapper->(IMatched)mapper)
		.collect(Collectors.toSet());

		return objects;
	}
}