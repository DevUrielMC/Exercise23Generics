package com.exercise23generics.model;

							//se declara la clase generics 
public class Resta <K, V>
{
	K key;
	V value;

	public Resta()
	{
	}

	public Resta(K key, V value)
	{
		this.key = key;
		this.value = value;
	}

	public K getKey()
	{
		return this.key;
	}
	public void setKey(K key)
	{
		this.key = key;
	}
	public V getValue()
	{
		return this.value;
	}
	public void setValue(V value)
	{
		this.value = value;
	}
	public String ToString()
	{
		return "Key:"+this.key+" value:"+this.value;
	}

}
