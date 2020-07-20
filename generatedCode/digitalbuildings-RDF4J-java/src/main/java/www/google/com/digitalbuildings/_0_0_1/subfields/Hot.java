package www.google.com.digitalbuildings._0_0_1.subfields;

import digitalbuildings.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
* Class Hot 
* Associated with hot area or process.
*/
@SuppressWarnings("serial")
public class Hot extends www.google.com.digitalbuildings._0_0_1.subfields.Descriptor implements IHot{

	IRI newInstance;
	public Hot(String namespace, String instanceId) {
		super(namespace, instanceId);

		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(this, RDF.TYPE, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Hot"));
	}

	public IRI iri()
	{
		return newInstance;
	}

	public static Set<IHot> getAllHotsObjectsCreated(){
		Set<IHot> objects = new HashSet<>();
		objects = GLOBAL.model.filter(null, RDF.TYPE, GLOBAL.factory
		.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Hot")).subjects().stream()
		.map(mapper->(IHot)mapper)
		.collect(Collectors.toSet());

		return objects;
	}
}