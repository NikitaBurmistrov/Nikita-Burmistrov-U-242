def is_mag_square(matrix):
    n = len(matrix)

    target_sum = sum(matrix[0])

    for row in matrix:
        if sum(row) != target_sum:
            return False

    for col in range(n):
        col_sum = sum(matrix[row][col] for row in range(n))
        if col_sum != target_sum:
            return False

    ma_diag_sum = sum(matrix[i][i] for i in range(n))
    if ma_diag_sum != target_sum:
        return False

    sec_diag_sum = sum(matrix[i][n - i - 1] for i in range(n))
    if sec_diag_sum != target_sum:
        return False

    return True



def read_matrix_from_file(file_name):
    with open(file_name, 'r', encoding='utf-8') as file:
        matrix = []
        for line in file:
            row = list(map(int, line.split()))
            matrix.append(row)
    return matrix



def write_result_to_file(file_name, is_magic):
    with open(file_name, 'w', encoding='utf-8') as file:
        if is_magic:
            file.write("Матрица является магическим квадратом.\n")
        else:
            file.write("Матрица не является магическим квадратом.\n")


inp_file = "Бурмистров_Никита_Викторович_У-242_vvod.txt"
out_file = "Бурмистров_Никита_Викторович_У-242_vivod.txt"


matrix = read_matrix_from_file(inp_file)

is_magic = is_mag_square(matrix)

write_result_to_file(out_file, is_magic)

print("Обработка завершена. Результат записан в файл.")