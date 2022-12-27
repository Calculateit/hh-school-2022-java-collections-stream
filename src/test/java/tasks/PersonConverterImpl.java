package tasks;

import common.ApiPersonDto;
import common.Person;
import common.PersonConverter;

class PersonConverterImpl implements PersonConverter {
  @Override
  public ApiPersonDto convert(Person person) {
    return new ApiPersonDto()
        .setCreated(person.getCreatedAt().toEpochMilli())
        .setId(person.getId().toString())
        .setName(person.getFirstName());
  }

  @Override
  public ApiPersonDto convert(Person person, Integer areaId) {
    return new ApiPersonDto()
        .setCreated(person.getCreatedAt().toEpochMilli())
        .setId(person.getId().toString())
        .setName(person.getFirstName())
        .setAreaId(areaId);
  }
}
