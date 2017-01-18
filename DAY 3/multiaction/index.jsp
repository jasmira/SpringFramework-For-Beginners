<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h3>Multi Action Controller in Spring MVC</h3>
<h4>This example demonstrates the design of single controller class with multiple methods</h4>
<br/>

<table border=1 >
<tr><th>Click Here</th><th>Mapped link</th><th>Method in Controller</th></tr>
<tr><td><a href=customer/Add.htm>Add Customer</a></td><td>customer/Add.htm</td><td>testAddCustomer()</td></tr>
<tr><td><a href=customer/Delete.htm>Delete Customer</a></td><td>customer/Delete.htm</td><td>testDeleteCustomer</td></tr>
<tr><td><a href=customer/Update.htm>Update Customer</a></td><td>customer/Update.htm</td><td>testUpdateCustomer</td></tr>
<tr><td><a href=customer/List.htm>List Customers</a></td><td>customer/List.htm</td><td>testListCustomer</td></tr>
</table>