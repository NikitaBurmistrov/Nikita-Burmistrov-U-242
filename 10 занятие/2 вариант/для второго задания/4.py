def swap_f_l_c(matrix):
    N = len(matrix)

    for i in range(N):
        matrix[i][0], matrix[i][len(matrix[i]) - 1] = matrix[i][len(matrix[i]) - 1], matrix[i][0]

    return matrix


def read_m_f_f(file_name):
    with open(file_name, 'r', encoding='utf-8') as file:
        matrix = []
        for line in file:
            row = list(map(int, line.split()))
            matrix.append(row)
    return matrix


def write_matrix_to_file(file_name, matrix):
    with open(file_name, 'w', encoding='utf-8') as file:
        for row in matrix:
            file.write(' '.join(map(str, row)) + '\n')


inp_file = "Бурмистров_Никита_Викторович_У-242_vvod.txt"
out_file = "Бурмистров_Никита_Викторович_У-242_vivod.txt"

matrix = read_m_f_f(inp_file)

new_matrix = swap_f_l_c(matrix)

write_matrix_to_file(out_file, new_matrix)

print("Обработка завершена. Результат записан в файл.")
