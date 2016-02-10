/*
 * #%L
 * Groovy Template :: Maven Plugin :: Example
 * %%
 * Copyright (C) 2016 Summit Management Systems, Inc.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
/**
 *
 * @author Justin Smith
 */
public class ExampleMain {
	public static void main(String[] args){
		//There are ${messages.size()} messages to print.
		<% for(def m : messages) { %>
			//Printing "$m" to console.
			System.out.println("$m");
		<% } %>
		
		System.out.println("Property from pom: foo=$foo");
	}
}
