package www.google.com.digitalbuildings._0_0_1.fields;

import digitalbuildings.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import www.google.com.digitalbuildings._0_0_1.subfields.IEconomizer;
import www.google.com.digitalbuildings._0_0_1.subfields.Economizer;
import www.google.com.digitalbuildings._0_0_1.subfields.IMode;
import www.google.com.digitalbuildings._0_0_1.subfields.Mode;


@SuppressWarnings("serial")
public class Economizer_mode extends www.google.com.digitalbuildings._0_0_1.fields.Field implements IEconomizer_mode{

	IRI newInstance;
	public Economizer_mode(String namespace, String instanceId) {
		super(namespace, instanceId);

		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(this, RDF.TYPE, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1/fields#Economizer_mode"));
	}

	public IRI iri()
	{
		return newInstance;
	}


  public void addComposedOfEconomizer (IEconomizer parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), parameter);
	}

	public Set<IEconomizer> getComposedOfEconomizer (){
		Set<IEconomizer> ComposedOfEconomizer = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), null)
		.objects().forEach(action->{
			if(action instanceof Economizer) {
				ComposedOfEconomizer.add((Economizer)action);
			}
		});
		return ComposedOfEconomizer;
	}


  public void addComposedOfMode (IMode parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), parameter);
	}

	public Set<IMode> getComposedOfMode (){
		Set<IMode> ComposedOfMode = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), null)
		.objects().forEach(action->{
			if(action instanceof Mode) {
				ComposedOfMode.add((Mode)action);
			}
		});
		return ComposedOfMode;
	}

	public static Set<IEconomizer_mode> getAllEconomizer_modesObjectsCreated(){
		Set<IEconomizer_mode> objects = new HashSet<>();
		objects = GLOBAL.model.filter(null, RDF.TYPE, GLOBAL.factory
		.createIRI("http://www.google.com/digitalbuildings/0.0.1/fields#Economizer_mode")).subjects().stream()
		.map(mapper->(IEconomizer_mode)mapper)
		.collect(Collectors.toSet());

		return objects;
	}
}