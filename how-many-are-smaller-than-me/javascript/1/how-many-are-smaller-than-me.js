const smaller = nums =>
  nums.map((m, i) =>
    nums.reduce((s, n, j) =>
      j <= i || m <= n
        ? s
        : s + 1, 0
    )
  )