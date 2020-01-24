import socket

HOST = '127.0.0.1'
PORT = 9000
address = (HOST, PORT)
serv_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
serv_socket.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
serv_socket.bind(address)

serv_socket.listen(10)
print("Aguardando conexão")
con, client = serv_socket.accept()
print("Conectado")
print("Aguardando mensagem")
data = con.recv(1024)
print(type(data))
print(type(data.decode()))
serv_socket.close()


