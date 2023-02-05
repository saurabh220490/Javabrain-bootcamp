## Topics which were covered in first session-->

1. Working of a 3 tier architecture of both simple web application and microservice based application.
2. CDN(Content delivery network)-Distributed servers that deliver web content to users based on geographical location and workflow of CDN(comprises origin server and edge servers).

3. How a web request works in simple words--
* Broswers requests for IP address to DNS server/resolver(which acts as an aliasing system)- resolves domain name of URL to it's corresponding IP address.
* Browser receives the IP address of the closest CDN edge server.
* Browser requests for the webpage to the CDN edge server.
* Edge server checks for content in cache.
* If requested rezsource is found, then it(server) receives cached content and sends back to the broswer as a response(static web content/page)
* If not found in cache, edge server requests to the origin server.
* Origin server sends the requested content to the edge server.
* Edge server stores a copy of it in cache area and sends as a response(static web content/page) to the client browser.
* Client broswer receives and renders the page.

4. How a REST APi call works in simple words---

* Javascript code constructs an HTTP request
* Adds endpoint API url and HTTP method to the request object.
* Includes the necessary parameters and data.
* Server gets request and returns response.
* JavaScript receives response and processes it.
* Response manifests as a UI change.

5. Discussion on HTTP request and response.
6. How cookies work and how server maintains connection with the client through a session id to uniquely identify the client subsequent requests. 

7. Overview of GIT workflow. 
