values = input().split()
a = float(values[0])
b = float(values[1])
c = float(values[2])

print(f'TRIANGULO: {((a*c)/2):.3f}')
print(f'CIRCULO: {(3.14159*(c**2)):.3f}')
print(f'TRAPEZIO: {(((a+b) * c) / 2):.3f}')
print(f'QUADRADO: {(b**2):.3f}')
print(f'RETANGULO: {(a*b):.3f}')

