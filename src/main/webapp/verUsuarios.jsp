<%@page import="logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyprimeraparte.jsp"%>

<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Ver Usuarios</h1>
    <p class="mb-4">A continuacion podra ver la lista de usuarios.</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Usuarios</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre de usuario</th>
                            <th>Rol</th>
                            <th style="width: 210px">Accion</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>ID</th>
                            <th>Nombre de usuario</th>
                            <th>Rol</th>
                            <th style="width: 210px">Accion</th>

                        </tr>
                    </tfoot>
                    
                    <%
                        List<Usuario> listaUsuarios = (List<Usuario>) request.getSession().getAttribute("listausuarios");
                    %>
                    
                        <%for(Usuario usu : listaUsuarios){%>
                       
                        <tr>
                            <td><%=usu.getIdUsuario()%></td>
                            <td><%=usu.getNombreUsuario()%></td>
                            <td><%=usu.getRol()%></td>
                            <td style="display: flex; width: 230px">
                                <form name="eliminar" action="SvElimUsuarios" method="POST">
                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color: red; margin-right: 5px">
                                        <i class="fas fa-trash-alt"></i> Eliminar
                                    </button>
                                    <input type="hidden" name="id" value="<%=usu.getIdUsuario()%>">
                                </form>
                                <<form name="editar" action="SvEditUsuarios" method="GET">
                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color: blue; margin-left: 5px">
                                        <i class="fas fa-pencil-alt"></i> Editar
                                    </button>
                                    <input type="hidden" name="id" value="<%=usu.getIdUsuario()%>">
                                </form>
                            </td>
                            
                        </tr>
                        <%}%>
                    
                </table>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->

</div>
<!-- End of Main Content -->




<%@include file="components/bodyfinal.jsp"%>