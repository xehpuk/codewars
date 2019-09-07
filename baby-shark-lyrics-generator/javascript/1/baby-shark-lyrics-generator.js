babySharkLyrics = () =>
  ['Baby','Mommy','Daddy','Grandma','Grandpa',"Let's go hunt"].map((v, i, vs) => {
    const intro = i < vs.length - 1 ? `${v} shark` : v
    const line = intro + ', doo doo doo doo doo doo\n'
    return line + line + line + intro + '!\n'
  }).join('') + 'Run away,…'